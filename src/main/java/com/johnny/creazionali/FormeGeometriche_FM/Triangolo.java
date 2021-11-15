package com.johnny.creazionali.FormeGeometriche_FM;

public class Triangolo extends Figura {

	public Triangolo(String c) { super(c); }
	
	@Override
	public void stampaFigura() {
		System.out.println("  "+c+" ");
		System.out.println(" "+c+" "+c);
		System.out.println(c+" "+c+" "+c);
		System.out.println();
	}

}
