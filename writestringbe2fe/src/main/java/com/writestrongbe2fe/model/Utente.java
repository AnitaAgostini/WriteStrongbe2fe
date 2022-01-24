package com.writestrongbe2fe.model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "TB_UTENTE")
public  class  Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="TB_UTENTE_SEQ")
	@SequenceGenerator(name="TB_UTENTE_SEQ", sequenceName = "TB_UTENTE_SEQ", initialValue = 1, allocationSize = 1)
	private Long id_utente;
	
	@Column(name="nome", nullable =false, length = 255)
	private String nome;
	
	@Column(name="cognome", nullable = false, length = 255)
	private String cognome;
	
	@Column(name="username", nullable = false, length = 255)
	private  String username;
	
	@Column(name="email", nullable = false, length = 255)
	private String email;
	
	@Column(name="data_nascita", nullable = false)
	private LocalDate data_nascita;
	
	@Column(name="password", nullable = false, length = 255)
	private String password;

	
	
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

   

	public Utente(Long id_utente, String nome, String cognome, String username, String email, LocalDate data_nascita,
			String password) {
		super();
		this.id_utente = id_utente;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.email = email;
		this.data_nascita = data_nascita;
		this.password = password;
	}



	public Utente() {};

	
}