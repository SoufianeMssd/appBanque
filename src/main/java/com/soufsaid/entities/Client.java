package com.soufsaid.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable{
	private Long code;
	private String name;
	private String email;
	private Collection<Compte> comptes;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public Client(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
