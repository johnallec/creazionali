package com.johnny.creazionali.Creature_AF;

import java.util.Arrays;
import java.util.List;

import com.johnny.creazionali.Creature_AF.creature.deathclaw.DeathclawLeggendario;
import com.johnny.creazionali.Creature_AF.creature.deathclaw.DeathclawRadioattivo;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulSoprintendente;
import com.johnny.creazionali.Creature_AF.creature.ghoul.GhoulSplendente;
import com.johnny.creazionali.Creature_AF.creature.supermutanti.SuperMutanteBehemoth;
import com.johnny.creazionali.Creature_AF.creature.supermutanti.SuperMutanteSwan;

public class CreatoreCreatureLivelloDifficile extends CreaturaFactory{
	
	@Override
	public List<Creatura> creaGhoul() {
		return Arrays.asList(new Creatura[]{new GhoulSoprintendente(), new GhoulSplendente()});
	}

	@Override
	public List<Creatura> creaSuperMutanti() {
		return Arrays.asList(new Creatura[]{new SuperMutanteBehemoth(), new SuperMutanteSwan()});
	}

	@Override
	public List<Creatura> creaDeathclaw() {
		return Arrays.asList(new Creatura[]{new DeathclawLeggendario(), new DeathclawRadioattivo()});
	}
}
