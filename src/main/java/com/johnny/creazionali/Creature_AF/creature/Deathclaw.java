package com.johnny.creazionali.Creature_AF.creature;

import com.johnny.creazionali.Creature_AF.Creatura;

public class Deathclaw extends Creatura {

	public Deathclaw() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Deathclaw/Deathclaw.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " Deathclaw []";
	}

}
