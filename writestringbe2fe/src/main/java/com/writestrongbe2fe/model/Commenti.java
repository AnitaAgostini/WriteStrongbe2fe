//package com.writestrongbe2fe.model;
//
//import java.sql.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "COMMENTI")
//public class Commenti {
//  
//	@Id
//	@GeneratedValue
//	private Long id_commenti;
//	
//	@Column
//	private String UserName;
//	
//	@Column
//	private Date data_pubblicazione;
//	
//	@Column
//	private String testo ;
//
//	public Long getId_commenti() {
//		return id_commenti;
//	}
//
//	public void setId_commenti(Long id_commenti) {
//		this.id_commenti = id_commenti;
//	}
//
//	public String getUserName() {
//		return UserName;
//	}
//
//	public void setUserName(String userName) {
//		UserName = userName;
//	}
//
//	public Date getData_pubblicazione() {
//		return data_pubblicazione;
//	}
//
//	public void setData_pubblicazione(Date data_pubblicazione) {
//		this.data_pubblicazione = data_pubblicazione;
//	}
//
//	public String getTesto() {
//		return testo;
//	}
//
//	public void setTesto(String testo) {
//		this.testo = testo;
//	}
//
//	@Override
//	public String toString() {
//		return "Commenti [id_commenti=" + id_commenti + ", UserName=" + UserName + ", data_pubblicazione="
//				+ data_pubblicazione + ", testo=" + testo + "]";
//	}
//	
//	
//	
//	
//}
