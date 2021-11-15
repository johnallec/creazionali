package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;

public class GhoulSplendente extends Ghoul {
	
	public GhoulSplendente() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/GlowingOne.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulSplendente []";
	}
}
