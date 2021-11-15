package com.johnny.creazionali.AlberoDiNatale_PR;

public class Cerchio extends Decorazione {
	
	private double diametro;
	
	public Cerchio() {
		super();
		this.tipo = 1;
		this.diametro = 0.0;
	}
	
	public Cerchio(double diametro) {
		this.tipo = 1;
		this.diametro = diametro;
	}
	
	@Override
	public Decorazione clona() {
		return new Cerchio(this.diametro);
	}
	
	@Override
	public String toString() {
		return "Tipo: " + Integer.toString(this.tipo) + " Diametro: " + Double.toString(this.diametro) + " cm";
	}
}
