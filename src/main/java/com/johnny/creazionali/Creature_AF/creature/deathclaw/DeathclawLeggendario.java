package com.johnny.creazionali.Creature_AF.creature.deathclaw;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;

public class DeathclawLeggendario extends Deathclaw {

	public DeathclawLeggendario() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/DeathclawAlpha.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " DeathclawLeggendario []";
	}

}
