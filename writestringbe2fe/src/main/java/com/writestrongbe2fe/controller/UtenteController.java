package com.writestrongbe2fe.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.writestrongbe2fe.response.LoginResponse;
import com.writestrongbe2fe.response.SignupResponse;
import com.writestrongbe2fe.service.UtenteService;
import com.writestrongbw2fe.request.LoginRequest;
import com.writestrongbw2fe.request.SignupRequest;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "api", produces = {MediaType.APPLICATION_JSON_VALUE, "application/hal+json"})
@CrossOrigin(origins="http://localhost:8080")
public class UtenteController {
	
	@Autowired
	UtenteService utenteService;
 
	private static final Logger logger = Logger.getLogger(UtenteController.class.getName());
   
	@GetMapping(path="/utente/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
		try {
			LoginResponse response = utenteService.login(request);
		 return ok(response);
		} catch(Exception e ) {
			logger.warning(e.getMessage());
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	
	}
  	
   @GetMapping(path="/utente/signup")
   public ResponseEntity<SignupResponse> register(@RequestBody SignupRequest request){
	  try {
		  SignupResponse response = utenteService.register(request);
			return ok(response)	 ;
	  } catch(Exception e) {
		  logger.warning( e.getMessage());
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	  }
	   
   }
}
	