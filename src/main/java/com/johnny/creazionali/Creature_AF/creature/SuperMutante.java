package com.johnny.creazionali.Creature_AF.creature;

import com.johnny.creazionali.Creature_AF.Creatura;

public class SuperMutante extends Creatura {

	public SuperMutante() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Supermutanti/SuperMutant.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " SuperMutante []";
	}

}
