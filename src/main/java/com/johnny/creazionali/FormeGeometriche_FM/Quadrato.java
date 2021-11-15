package com.johnny.creazionali.FormeGeometriche_FM;

public class Quadrato extends Figura {

	public Quadrato(String c) { super(c); }

	@Override
	public void stampaFigura() {
		System.out.println(c+c+c+c+c+c+c+c);
		System.out.println(c+"      "+c);
		System.out.println(c+"      "+c);
		System.out.println(c+"      "+c);
		System.out.println(c+"      "+c);
		System.out.println(c+"      "+c);
		System.out.println(c+"      "+c);
		System.out.println(c+c+c+c+c+c+c+c);
		System.out.println();
	}

}
