package com.soufsaid.entities;

import java.io.Serializable;
import java.util.Date;

public abstract class Operation implements Serializable {
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(Date dateOp, double montant, Compte compte) {
		super();
		this.dateOp = dateOp;
		this.montant = montant;
		this.compte = compte;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Date getDateOp() {
		return dateOp;
	}
	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	private Long number;
	private Date dateOp;
	private double montant;
	private Compte compte;
}
