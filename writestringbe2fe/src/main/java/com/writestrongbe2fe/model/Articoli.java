//package com.writestrongbe2fe.model;
//
//import java.time.Instant;
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "TB_ARTICOLI")
//public class Articoli {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_ARTICOLI_SEQ")
//	@SequenceGenerator(name = "TB_ARTICOLI_SEQ", sequenceName = "TB_ARTICOLI_SEQ", initialValue = 1, allocationSize = 1)
//	private Long id_articolo;
//	
//	@Column(name = "commenti", nullable = true, length = 144)
//	private String commenti;
//	
//	
//	@Column(name = "contenuti", nullable = true, length = 255)
//	private String contenuti;
//	
//	@Column(name = "categoria", nullable = true, length= 20)
//	private String categoria;
//	
//	@Column(name = "username", nullable = false, length = 50)
//	private String username;
//	
//	@Column(name= "titolo", nullable = true, length =50)
//	private String titolo;
//	
//	@Column(name="data_pubblicazione", nullable = false)
//	private LocalDate data_pubblicazione;
//
//	@Column(name="createOn", nullable = false)
//	private Instant createOn;
//	
//	@Column(name="updateOn", nullable = false)
//	private Instant updateOn;
//
//	public Long getId_articolo() {
//		return id_articolo;
//	}
//
//	public void setId_articolo(Long id_articolo) {
//		this.id_articolo = id_articolo;
//	}
//
//	public String getCommenti() {
//		return commenti;
//	}
//
//	public void setCommenti(String commenti) {
//		this.commenti = commenti;
//	}
//
//	  
//	
//	public String getContenuti() {
//		return contenuti;
//	}
//
//	public void setContenuti(String contenuti) {
//		this.contenuti = contenuti;
//	}
//
//	public String getCategoria() {
//		return categoria;
//	}
//
//	public void setCategoria(String categoria) {
//		this.categoria = categoria;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getTitolo() {
//		return titolo;
//	}
//
//	public void setTitolo(String titolo) {
//		this.titolo = titolo;
//	}
//
//	public LocalDate getData_pubblicazione() {
//		return data_pubblicazione;
//	}
//
//	public void setData_pubblicazione(LocalDate data_pubblicazione) {
//		this.data_pubblicazione = data_pubblicazione;
//	}
//
//	public Instant getCreateOn() {
//		return createOn;
//	}
//
//	public void setCreateOn(Instant createOn) {
//		this.createOn = createOn;
//	}
//
//	public Instant getUpdateOn() {
//		return updateOn;
//	}
//
//	public void setUpdateOn(Instant updateOn) {
//		this.updateOn = updateOn;
//	}
//
//	
//	public Articoli(Long id_articolo, String commenti, String categoria, String username, String titolo,
//			LocalDate data_pubblicazione, Instant createOn, Instant updateOn, String contenuti) {
//		super();
//		this.id_articolo = id_articolo;
//		this.commenti = commenti;
//		this.contenuti = contenuti;
//		this.categoria = categoria;
//		this.username = username;
//		this.titolo = titolo;
//		this.data_pubblicazione = data_pubblicazione;
//		this.createOn = createOn;
//		this.updateOn = updateOn;
//	}
//	
//	public Articoli() {}
//	
//	
//	
//	
//}
