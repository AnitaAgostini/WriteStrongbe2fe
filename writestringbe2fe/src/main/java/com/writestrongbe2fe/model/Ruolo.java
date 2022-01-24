//package com.writestrongbe2fe.model;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="RUOLO")
//public class Ruolo {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private String descrizione;
//	
//	@OneToMany(mappedBy = "ruolo")
//	private List<Utente> utenti;
//	
//	public Ruolo() {}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getDescrizione() {
//		return descrizione;
//	}
//
//	public void setDescrizione(String descrizione) {
//		this.descrizione = descrizione;
//	}
//
//	public List<Utente> getUtenti() {
//		return utenti;
//	}
//
//	public void setUtenti(List<Utente> utenti) {
//		this.utenti = utenti;
//	}
//
//	@Override
//	public String toString() {
//		return "Ruolo [id=" + id + ", descrizione=" + descrizione + ", utenti=" + utenti + "]";
//	}
//    
//	
//	
//	
//	
//}
