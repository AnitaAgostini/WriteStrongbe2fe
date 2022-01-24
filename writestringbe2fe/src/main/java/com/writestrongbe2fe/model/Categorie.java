//package com.writestrongbe2fe.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "CATEGORIA")
//public class Categorie {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private int id_categoria;
//	@Column
//	private String Descrizione;
//	@Column 
//	private String Nome;
//	public int getId_categoria() {
//		return id_categoria;
//	}
//	public void setId_categoria(int id_categoria) {
//		this.id_categoria = id_categoria;
//	}
//	public String getDescrizione() {
//		return Descrizione;
//	}
//	public void setDescrizione(String descrizione) {
//		Descrizione = descrizione;
//	}
//	public String getNome() {
//		return Nome;
//	}
//	public void setNome(String nome) {
//		Nome = nome;
//	}
//	@Override
//	public String toString() {
//		return "Categorie [id_categoria=" + id_categoria + ", Descrizione=" + Descrizione + ", Nome=" + Nome + "]";
//	}
//	public Categorie(int id_categoria, String descrizione, String nome) {
//		super();
//		this.id_categoria = id_categoria;
//		Descrizione = descrizione;
//		Nome = nome;
//	}
//	
//	
//}
