package com.johnny.creazionali.Creature_AF;

import java.util.Arrays;
import java.util.List;

import com.johnny.creazionali.Creature_AF.creature.deathclaw.DeathclawGrintoso;
import com.johnny.creazionali.Creature_AF.creature.deathclaw.DeathclawMadre;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulSoldato;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulTecnologistaFeroce;
import com.johnny.creazionali.Creature_AF.creature.supermutanti.SuperMutanteCapo;
import com.johnny.creazionali.Creature_AF.creature.supermutanti.SuperMutanteSupremo;

public class CreatoreCreatureLivelloMedio extends CreaturaFactory{
	
	@Override
	public List<Creatura> creaGhoul() {
		return Arrays.asList(new Creatura[]{new GhoulTecnologistaFeroce(), new GhoulSoldato()});
	}

	@Override
	public List<Creatura> creaSuperMutanti() {
		return Arrays.asList(new Creatura[]{new SuperMutanteCapo(), new SuperMutanteSupremo()});
	}

	@Override
	public List<Creatura> creaDeathclaw() {
		return Arrays.asList(new Creatura[]{new DeathclawGrintoso(), new DeathclawMadre()});
	}
}
