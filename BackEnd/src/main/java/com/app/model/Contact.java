package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact",catalog="testdb")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adressePostal;
	private String numeroTele;
	private String email;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int id, String nom, String prenom, String adressePostal, String numeroTele, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostal = adressePostal;
		this.numeroTele = numeroTele;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdressePostal() {
		return adressePostal;
	}

	public void setAdressePostal(String adressePostal) {
		this.adressePostal = adressePostal;
	}

	public String getNumeroTele() {
		return numeroTele;
	}

	public void setNumeroTele(String numeroTele) {
		this.numeroTele = numeroTele;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
