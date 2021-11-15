package com.johnny.creazionali.Creature_AF;

import java.util.Arrays;
import java.util.List;

import com.johnny.creazionali.Creature_AF.creature.Deathclaw;
import com.johnny.creazionali.Creature_AF.creature.SuperMutante;
import com.johnny.creazionali.Creature_AF.creature.deathclaw.DeathclawAlbino;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulFeroce;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulVagabondoFeroce;
import com.johnny.creazionali.Creature_AF.creature.supermutanti.SuperMutanteBruto;

public class CreatoreCreatureLivelloFacile extends CreaturaFactory {

	@Override
	public List<Creatura> creaGhoul() {
		return Arrays.asList(new Creatura[]{new GhoulFeroce(), new GhoulVagabondoFeroce()});
	}

	@Override
	public List<Creatura> creaSuperMutanti() {
		return Arrays.asList(new Creatura[]{new SuperMutante(), new SuperMutanteBruto()});
	}

	@Override
	public List<Creatura> creaDeathclaw() {
		return Arrays.asList(new Creatura[]{new Deathclaw(), new DeathclawAlbino()});
	}
}
