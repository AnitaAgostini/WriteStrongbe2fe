package com.writestrongbw2fe.request;

import java.time.LocalDate;

public class SignupRequest {
 
	public String nome;
	public String congome;
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
		return congome;
	}



	public void setCongome(String congome) {
		this.congome = congome;
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


	public SignupRequest(){};
	
}


