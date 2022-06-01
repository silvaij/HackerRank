package us.code.gym.coursera.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
     public static void main(String[] args) {
		List<Candidato> lista = new ArrayList<Candidato>(){{
		   add(new Candidato(80.7, true, 30));
		   add(new Candidato(80.7,false,25));
		   add(new Candidato(80.7,false,28));
		   add(new Candidato(80.7,false,20));
		   add(new Candidato(90.7,false,21));
		}};
		
		Collections.sort(lista);
		
		for(Candidato c: lista) {
			System.out.println(c);
		}
	}
}
