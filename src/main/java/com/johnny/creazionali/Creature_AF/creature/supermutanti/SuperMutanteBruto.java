package com.johnny.creazionali.Creature_AF.creature.supermutanti;

import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

public class SuperMutanteBruto extends SuperMutante {

	public SuperMutanteBruto() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant_brute.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutanteBruto []";
	}

}
