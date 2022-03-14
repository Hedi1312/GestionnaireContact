package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user",catalog="testdb")

public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String prenom;
		private String password;
		private String adresseMail;
		private String nomUtilisateur;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id,String prenom, String password, String adresseMail, String nomUtilisateur) {
			super();
			this.id = id;
			this.prenom = prenom;
			this.password = password;
			this.adresseMail = adresseMail;
			this.nomUtilisateur = nomUtilisateur;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAdresseMail() {
			return adresseMail;
		}
		public void setAdresseMail(String adresseMail) {
			this.adresseMail = adresseMail;
		}
		public String getNomUtilisateur() {
			return nomUtilisateur;
		}
		public void setNomUtilisateur(String nomUtilisateur) {
			this.nomUtilisateur = nomUtilisateur;
		}

}
