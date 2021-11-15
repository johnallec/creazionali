package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;

public class GhoulVagabondoFeroce extends Ghoul {
	
	public GhoulVagabondoFeroce() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/FeralGhoul.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulVagabondoFeroce []";
	}
}
