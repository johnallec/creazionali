package com.johnny.creazionali.Creature_AF.creature.deathclaw;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;

public class DeathclawGrintoso extends Deathclaw {

	public DeathclawGrintoso() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/SavageDeathclaw.jpg");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " DeathclawGrintoso []";
	}

}
