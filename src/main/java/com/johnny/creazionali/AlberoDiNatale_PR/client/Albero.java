package com.johnny.creazionali.AlberoDiNatale_PR.client;

import java.util.ArrayList;
import java.util.List;

import com.johnny.creazionali.AlberoDiNatale_PR.Cerchio;
import com.johnny.creazionali.AlberoDiNatale_PR.Decorazione;
import com.johnny.creazionali.AlberoDiNatale_PR.Stella;

public class Albero {
	
	private List<Integer> listaIdDecorazioni;
	private List<Decorazione> listaDecorazioni;
	
	public Albero(List<Integer> d) {
		listaIdDecorazioni = (ArrayList<Integer>) d;
		listaDecorazioni = new ArrayList<Decorazione>();
	}
	
	public void decora() {
		Decorazione stella = new Stella(1000.14);
		Decorazione cerchio = new Cerchio(10.0);
		for(Integer i : listaIdDecorazioni)
			switch(i) {
				case 0:
					listaDecorazioni.add(stella.clona()); break;
				case 1:
					listaDecorazioni.add(cerchio.clona()); break;
			}
		for(Decorazione d : listaDecorazioni) {
			System.out.println(d.toString());
		}
	}
}
