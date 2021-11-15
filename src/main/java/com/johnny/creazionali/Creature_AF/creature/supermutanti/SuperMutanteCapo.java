package com.johnny.creazionali.Creature_AF.creature.supermutanti;

import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

public class SuperMutanteCapo extends SuperMutante {

	public SuperMutanteCapo() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant_master.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutanteCapo []";
	}

}
