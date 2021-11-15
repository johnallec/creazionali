package com.johnny.creazionali.FormeGeometriche_FM;

public class FiguraGeometricaAsterischi extends FiguraGeometricaCreator {
	
	public FiguraGeometricaAsterischi() { super(); }
	
	@Override
	public void creaFigure() {
		list.add(new Quadrato("*"));
		list.add(new Triangolo("*"));
		list.add(new Rombo("*"));
	}
}
