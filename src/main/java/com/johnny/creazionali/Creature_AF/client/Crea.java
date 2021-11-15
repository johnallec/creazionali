package com.johnny.creazionali.Creature_AF.client;

import com.johnny.creazionali.Creature_AF.CreaturaFactory;
import com.johnny.creazionali.Creature_AF.creature.Deathclaw;
import com.johnny.creazionali.Creature_AF.creature.Ghoul;
import com.johnny.creazionali.Creature_AF.creature.SuperMutante;

import java.util.ArrayList;
import java.util.List;

import com.johnny.creazionali.Creature_AF.CreatoreCreatureLivelloDifficile;
import com.johnny.creazionali.Creature_AF.CreatoreCreatureLivelloFacile;
import com.johnny.creazionali.Creature_AF.CreatoreCreatureLivelloMedio;
import com.johnny.creazionali.Creature_AF.Creatura;

public class Crea extends CreaturaFactory {
	
	public List<Creatura> get(Creatura creatura){
		CreatoreCreatureLivelloFacile cf = new CreatoreCreatureLivelloFacile();
		CreatoreCreatureLivelloMedio cm = new CreatoreCreatureLivelloMedio();
		CreatoreCreatureLivelloDifficile cd = new CreatoreCreatureLivelloDifficile();
		List<Creatura> tmp = new ArrayList<Creatura>();
		if(creatura instanceof Ghoul){
			for(Creatura c : cf.creaGhoul())
				tmp.add(c);
			for(Creatura c : cm.creaGhoul())
				tmp.add(c);
			for(Creatura c : cd.creaGhoul())
				tmp.add(c);
		}
		else if(creatura instanceof SuperMutante){
			for(Creatura c : cf.creaSuperMutanti())
				tmp.add(c);
			for(Creatura c : cm.creaSuperMutanti())
				tmp.add(c);
			for(Creatura c : cd.creaSuperMutanti())
				tmp.add(c);
		}
		else if(creatura instanceof Deathclaw){
			for(Creatura c : cf.creaDeathclaw())
				tmp.add(c);
			for(Creatura c : cm.creaDeathclaw())
				tmp.add(c);
			for(Creatura c : cd.creaDeathclaw())
				tmp.add(c);
		}
		return tmp;
	}
}
