package com.soufsaid.entities;

import java.util.Date;

public class CompteEpargne extends Compte {
	private double taux;

	public CompteEpargne(String codeCompte, Date dateCompte, double solde,
			Client client, double taux) {
		super(codeCompte, dateCompte, solde, client);
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
