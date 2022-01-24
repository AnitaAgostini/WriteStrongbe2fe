package com.writestrongbe2fe.response;

import java.time.LocalDate;

public class LoginResponse {
    
	private Long id_utente;
	
	
	private String nome;
	
	
	private String cognome;
	
	
	private String username;
	

	private String email;
	

	private LocalDate data_nascita;


	public Long getId_utente() {
		return id_utente;
	}


	public void setId_utente(Long id_utente) {
		this.id_utente = id_utente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getData_nascita() {
		return data_nascita;
	}


	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}
	
  public LoginResponse() {};
	
}
