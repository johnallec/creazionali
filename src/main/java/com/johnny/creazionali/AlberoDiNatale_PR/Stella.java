package com.johnny.creazionali.AlberoDiNatale_PR;

public class Stella extends Decorazione {
	
	private double distanzaTerra;
	
	public Stella() {
		super();
		this.tipo = 0;
		this.distanzaTerra = 0.0;
	}
	
	public Stella(double distanzaTerra) {
		this.tipo = 0;
		this.distanzaTerra = distanzaTerra;
	}
	
	@Override
	public Decorazione clona() {
		return new Stella(distanzaTerra);
	}
	
	@Override
	public String toString() {
		return "Tipo: " + Integer.toString(this.tipo) + " Distanza dalla terra: " + Double.toString(this.distanzaTerra) + " km";
	}
}
