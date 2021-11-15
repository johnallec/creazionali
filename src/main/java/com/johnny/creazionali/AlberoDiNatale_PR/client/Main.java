package com.johnny.creazionali.AlberoDiNatale_PR.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0,1,1,0,1));
		Albero al = new Albero(list);
		al.decora();
	}

}