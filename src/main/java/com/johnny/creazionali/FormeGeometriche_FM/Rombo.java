package com.johnny.creazionali.FormeGeometriche_FM;

public class Rombo extends Figura {

	public Rombo(String c) { super(c); }
	
	@Override
	public void stampaFigura() {
		System.out.println("  "+c);
		System.out.println(" "+c+" "+c);
		System.out.println(c+"   "+c);
		System.out.println(" "+c+" "+c);
		System.out.println("  "+c+" ");	
		System.out.println();
	}

}
