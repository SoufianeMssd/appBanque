package com.soufsaid.entities;

import java.util.Date;

public class CompteCourant extends Compte{
	private double decouvert;

	public CompteCourant(String codeCompte, Date dateCompte, double solde,
			Client client, double decouvert) {
		super(codeCompte, dateCompte, solde, client);
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	

}
