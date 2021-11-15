package com.johnny.creazionali.Creature_AF.creature.deathclaw;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;

public class DeathclawRadioattivo extends Deathclaw {

	public DeathclawRadioattivo() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/GlowingDeathclaw.jpg");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " DeathclawRadioattivo []";
	} 

}
