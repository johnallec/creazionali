package com.johnny.creazionali.Creature_AF.creature.supermutanti;

import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

public class SuperMutanteSupremo extends SuperMutante {

	public SuperMutanteSupremo() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant_overlord.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutanteSupremo []";
	}

}
