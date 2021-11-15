package com.johnny.creazionali.Automobile_BU.Client;

import java.util.ArrayList;
import java.util.List;

import com.johnny.creazionali.Automobile_BU.Assemblatore;
import com.johnny.creazionali.Automobile_BU.Automobile;

public class Main {

	public static void main(String[] args) {
		Assemblatore as = new Assemblatore();
		List<Automobile> automobili = new ArrayList<Automobile>();
		for(int i = 0; i < 50000; ++i) {
			as.assemblaAutomobile();
			automobili.add(as.getResult());
		}
		for(Automobile automobile : automobili)
			System.out.println(automobile.toString());
	}

}
