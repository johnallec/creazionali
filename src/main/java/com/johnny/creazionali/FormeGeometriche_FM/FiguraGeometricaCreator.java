package com.johnny.creazionali.FormeGeometriche_FM;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometricaCreator {
	
	protected List<Figura> list;
	protected FiguraGeometricaCreator() { list = new ArrayList<Figura>(); }
	
	public void creaFigure() {}
	public void stampaLista() {
		for(Figura f : list)
			f.stampaFigura();
	}
}