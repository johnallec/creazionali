package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;

public class GhoulTecnologistaFeroce extends Ghoul {
	
	public GhoulTecnologistaFeroce() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/FeralGhoulReaver.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulTecnologistaFeroce []";
	}
}
