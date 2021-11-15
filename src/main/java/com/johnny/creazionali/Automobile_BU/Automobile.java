package com.johnny.creazionali.Automobile_BU;

import java.util.Random;

public class Automobile {
	
	private String alph;
	private String targa;
	private String modello;
	private String colore;
	
	public Automobile() {
		this.alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		this.targa = "";
		this.modello = "";
		this.colore = "";
	}
	
	public void creaTarga() {
		this.targa = "";
		for(int j=0; j<2; ++j)
			this.targa+=this.alph.charAt(new Random().nextInt(this.alph.length()));
		for(int j=0; j<3; ++j)
			this.targa+=String.valueOf(new Random().nextInt(10));
		for(int j=0; j<2; ++j)
			this.targa+=this.alph.charAt(new Random().nextInt(this.alph.length()));
	}
	
	public void scegliModello() {
		String[] modelli = {"Station Wagon","Berlina", "SUV", "Minivan", "Crossover", "Truck"};
		this.modello = modelli[new Random().nextInt(modelli.length)];
	}
	
	public void scegliColore() {
		String[] colori = {"giallo","arancione","verde","rosso","blu"};
		this.colore = colori[new Random().nextInt(colori.length)];
	}
	
	public String getTarga() { return this.targa; }
	
	public Automobile getResult() { return this; }
	
	@Override
	public String toString() { return this.targa + " " + this.modello + " " + this.colore; }
}
