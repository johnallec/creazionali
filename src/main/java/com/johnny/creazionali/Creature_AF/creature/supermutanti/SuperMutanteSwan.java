package com.johnny.creazionali.Creature_AF.creature.supermutanti;

import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

public class SuperMutanteSwan extends SuperMutante {

	public SuperMutanteSwan() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant_swan.jpg");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutanteSwan []";
	}

}
