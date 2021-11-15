package com.johnny.creazionali.Creature_AF.creature.deathclaw;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;

public class DeathclawMadre extends Deathclaw {

	public DeathclawMadre() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/Deathclawmother.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " DeathclawMadre []";
	}

}
