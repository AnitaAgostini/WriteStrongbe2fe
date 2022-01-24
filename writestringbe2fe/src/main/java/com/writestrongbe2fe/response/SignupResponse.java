package com.writestrongbe2fe.response;

import java.time.LocalDate;

public class SignupResponse {
	public String nome;
	public String cognome;
	public String password;
	public String email;
	public String Username;
	public LocalDate data_di_nascita;
	public String genere;
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCongome() {
		return cognome;
	}



	public void setCongome(String congome) {
		this.cognome = congome;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUsername() {
		return Username;
	}



	public void setUsername(String username) {
		Username = username;
	}



	public LocalDate getData_di_nascita() {
		return data_di_nascita;
	}



	public void setData_di_nascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}



	public String getGenere() {
		return genere;
	}



	public void setGenere(String genere) {
		this.genere = genere;
	}



	@Override
	public String toString() {
		return "SignupResponse [nome=" + nome + ", cognome=" + cognome + ", password=" + password + ", email=" + email
				+ ", Username=" + Username + ", data_di_nascita=" + data_di_nascita + ", genere=" + genere + "]";
	}


	

	public SignupResponse(String nome, String cognome, String password, String email, String username,
			LocalDate data_di_nascita, String genere) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.email = email;
		Username = username;
		this.data_di_nascita = data_di_nascita;
		this.genere = genere;
	}



	public SignupResponse() {};
}
