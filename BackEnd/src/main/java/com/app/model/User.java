package com.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user",catalog="testdb")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    @NotEmpty(message = "First name can not be empty")
    private String prenom;
    
    @NotEmpty(message = "nom can not be empty")
    private String nomUtilisateur;

    @NotEmpty(message = "Email can not be empty")
    @Email(message = "Please provide a valid email id")
    private String email;

    @NotEmpty(message = "Password can not be empty")
    private String password;

    
	public User(int id, @NotEmpty(message = "First name can not be empty") String prenom,
			@NotEmpty(message = "nom can not be empty") String nomUtilisateur,
			@NotEmpty(message = "Email can not be empty") @Email(message = "Please provide a valid email id") String email,
			@NotEmpty(message = "Password can not be empty") String password) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nomUtilisateur = nomUtilisateur;
		this.email = email;
		this.password = password;
	}

	
	public User() {
		super();
	}

	public int getId() {
		return this.id;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}