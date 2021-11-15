package com.johnny.creazionali.Creature_AF.creature.ghoul;

import com.johnny.creazionali.Creature_AF.creature.Ghoul;

public class GhoulSoprintendente extends Ghoul {
	
	public GhoulSoprintendente() {
		super();
		this.pathImg = getClass().getClassLoader().getResourceAsStream("imgcreature/Ghoul/Overseer.png");
	}
	
	@Override
	public String toString() {
		return this.pathImg + " GhoulSoprintendente []";
	}
}
