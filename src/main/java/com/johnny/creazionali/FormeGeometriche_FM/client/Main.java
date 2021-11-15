package com.johnny.creazionali.FormeGeometriche_FM.client;

import com.johnny.creazionali.FormeGeometriche_FM.FiguraGeometricaAsterischi;
import com.johnny.creazionali.FormeGeometriche_FM.FiguraGeometricaCreator;
import com.johnny.creazionali.FormeGeometriche_FM.FiguraGeometricaTratti;

public class Main {

	public static void main(String[] args) {
		FiguraGeometricaCreator f1 = new FiguraGeometricaAsterischi();
		f1.creaFigure();
		f1.stampaLista();
		FiguraGeometricaCreator f2 = new FiguraGeometricaTratti();
		f2.creaFigure();
		f2.stampaLista();
	}

}
