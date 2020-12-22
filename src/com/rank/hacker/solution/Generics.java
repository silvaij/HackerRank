package com.rank.hacker.solution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Generics {

	public static void main (String[] args) {
		//Mapas são setados com (CHAVE)(VALOR)<K,V> EX: Map<String,String>
		Map<String,String> mymap = new HashMap<String,String>();
		
		mymap = new LinkedHashMap<String,String>();
		
		mymap.put("Hi", "Bye");
		
		System.out.println(mymap.get("Hi"));
		
		mymap.put("Hi", "BYE!");
		
		System.out.println(mymap.get("Hi"));
		

	}

}
