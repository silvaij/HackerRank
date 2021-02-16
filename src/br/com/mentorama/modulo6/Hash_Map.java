package br.com.mentorama.modulo6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("C", "Carro");
		map.put("M", "Moto");
		map.put("B", "Bicilceta");
		
		System.out.println(map.get("C"));		
		map.remove("M");		
		System.out.println(map.get("M"));
		
		arvoreMap();
	}
	
	public static void arvoreMap() {
		//mais performatico
		Map<String, String> map = new TreeMap<>();
		map.put("H", "Homem");
		map.put("M", "Mulher");
		map.put("G", "Outro Genero");
		
		System.out.println(map.get("H"));		
		map.remove("M");		
		System.out.println(map.get("M"));
	}

}
