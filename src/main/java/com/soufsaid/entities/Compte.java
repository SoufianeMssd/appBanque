package com.soufsaid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Compte implements Serializable{
	private String codeCompte;
	private Date dateCompte;
	private double solde;
	private Client client;
	private Collection<Operation> operations;
}
