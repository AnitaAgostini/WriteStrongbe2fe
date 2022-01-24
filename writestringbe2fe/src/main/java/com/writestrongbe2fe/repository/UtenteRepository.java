
package com.writestrongbe2fe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.writestrongbe2fe.model.Utente;

@Repository
@Service
public interface UtenteRepository extends JpaRepository<Utente, Long> {

	@Query("SELECT u FROM Utente u WHERE u.username = :username  AND u.password = :password")
    public Optional<Utente> findByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
	
	
}