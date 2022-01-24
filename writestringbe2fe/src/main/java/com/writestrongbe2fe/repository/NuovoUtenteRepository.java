package com.writestrongbe2fe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.writestrongbe2fe.model.Utente;

public interface NuovoUtenteRepository extends JpaRepository<Utente, Long>{

	@Query("SELECT u FROM  Utente U WHERE u.nome = :nome AND u.cognome = : cognome AND  u.username = :username  AND u.password = :password AND u.email = :email")
	public static Optional<Utente>  finByNomeAndCognomeAndUsernameAndPasswordAndEmail(@Param("nome")String nome, @Param("cognome")String cognome, @Param("username") String username, @Param("password")String password, @Param("email")String email) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
