package com.johnny.creazionali.Automobile_BU;

import java.util.ArrayList;
import java.util.List;

public class Assemblatore {

	private List<String> targhe;
	private Automobile automobile;
	
	public Assemblatore() {
		targhe = new ArrayList<String>();
	}
	
	public void assemblaAutomobile() {
		this.automobile = new Automobile();
		this.automobile.creaTarga();
		boolean diversa = false;
		while(!diversa) {
			diversa = true;
			for(String targa : targhe)
				if(targa.compareTo(this.automobile.getTarga()) == 0) {
					this.automobile.creaTarga();
					diversa = false;
					System.out.println(targa + " e " + this.automobile.getTarga() + " coincidono!");
				}
		}
		targhe.add(this.automobile.getTarga());
		this.automobile.scegliColore();
		this.automobile.scegliModello();
	}
	
	public Automobile getResult() { return this.automobile;}
}
