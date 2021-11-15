package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;

public class GhoulSoldato extends Ghoul {
	
	public GhoulSoldato() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/FeralTrooperGhoul.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulSoldato []";
	}
}
