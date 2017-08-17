package com.soufsaid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public abstract class Compte implements Serializable{
	@Id @GeneratedValue
	private String codeCompte;
	private Date dateCompte;
	private double solde;
	private Client client;
	private Collection<Operation> operations;
	public String getCodeCompte() {
		return codeCompte;
	}
	public Compte(String codeCompte, Date dateCompte, double solde,
			Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCompte = dateCompte;
		this.solde = solde;
		this.client = client;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCompte() {
		return dateCompte;
	}
	public void setDateCompte(Date dateCompte) {
		this.dateCompte = dateCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
}

