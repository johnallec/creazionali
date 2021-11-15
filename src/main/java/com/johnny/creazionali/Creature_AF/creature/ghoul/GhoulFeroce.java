package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;



public class GhoulFeroce extends Ghoul {
	
	public GhoulFeroce() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/FeralGhoul.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulFeroce []";
	}
}
