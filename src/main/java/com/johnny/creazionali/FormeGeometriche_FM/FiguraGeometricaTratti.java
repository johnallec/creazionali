package com.johnny.creazionali.FormeGeometriche_FM;

public class FiguraGeometricaTratti extends FiguraGeometricaCreator {
	public FiguraGeometricaTratti() { super(); }
	
	@Override
	public void creaFigure() {
		list.add(new Quadrato("-"));
		list.add(new Triangolo("-"));
		list.add(new Rombo("-"));
	}
}
