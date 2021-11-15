package com.johnny.creazionali.Creature_AF.creature.deathclaw;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;

public class DeathclawAlbino extends Deathclaw {
	
	public DeathclawAlbino() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/AlbinoDeathclaw.png");
	}

	@Override
	public String toString() {
		return this.pathImg + " DeathclawAlbino []";
	}

}
