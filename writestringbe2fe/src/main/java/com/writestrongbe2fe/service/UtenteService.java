package com.writestrongbe2fe.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writestrongbe2fe.model.Utente;
import com.writestrongbe2fe.repository.NuovoUtenteRepository;
import com.writestrongbe2fe.repository.UtenteRepository;
import com.writestrongbe2fe.response.LoginResponse;
import com.writestrongbe2fe.response.SignupResponse;
import com.writestrongbw2fe.request.LoginRequest;
import com.writestrongbw2fe.request.SignupRequest;


@Service
public class UtenteService {


@Autowired
private UtenteRepository utenteRepository;

public LoginResponse login(LoginRequest request) {
	
	Optional<Utente> optUtente;
	Utente utente;
	optUtente = Optional.empty(); 
	LoginResponse loginResponse = new LoginResponse ();
	optUtente = utenteRepository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
	if(!optUtente.isEmpty()	) {
	utente = optUtente.get();
	loginResponse.setUsername(utente.getUsername());
	loginResponse.setNome(utente.getNome());
	loginResponse.setCognome(utente.getCognome());
	loginResponse.setEmail(utente.getEmail());
	loginResponse.setData_nascita(utente.getData_nascita());
	return loginResponse;
		
	} else {
		return null;
	}
	
}

public SignupResponse register(SignupRequest request){

Optional<Utente> newOptUtente;
Utente utente;
newOptUtente = Optional.empty();
SignupResponse signupResponse = new SignupResponse();
newOptUtente = NuovoUtenteRepository.finByNomeAndCognomeAndUsernameAndPasswordAndEmail(request.getNome(), request.getCongome(), request.getUsername(), request.getEmail(), request.getPassword());
if(!newOptUtente.isEmpty()){
   
	utente= newOptUtente.get();
	signupResponse.setUsername(utente.getUsername());
	signupResponse.setNome(utente.getNome());
	signupResponse.setCongome(utente.getCognome());
	signupResponse.setEmail(utente.getEmail());
	signupResponse.setData_di_nascita(utente.getData_nascita());
	
  return signupResponse;
} else {
	
	return null;
}

}


}
