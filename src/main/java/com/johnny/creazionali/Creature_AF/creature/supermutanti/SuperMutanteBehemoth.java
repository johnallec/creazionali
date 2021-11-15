package com.johnny.creazionali.Creature_AF.creature.supermutanti;

import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

public class SuperMutanteBehemoth extends SuperMutante {

	public SuperMutanteBehemoth() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant_behemoth.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutanteBehemoth []";
	}

}
