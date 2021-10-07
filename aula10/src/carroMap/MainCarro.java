package carroMap;

import java.util.HashMap;
import java.util.Set;

public class MainCarro {

	public static void main(String[] args) {
		/*
		HashMap<String, String> equipes = new HashMap<>();
		
		equipes.put("Rd", "Red Bull");
		equipes.put("Mc", "Mc Laren");
		equipes.put("Mr", "Mercedes");
		equipes.put("Wl", "Willians");
		equipes.put("Fr", "Ferrari");
		
		for (String s : equipes.keySet()) {
			
			System.out.println("Sigla " + s);
			System.out.println(" _Equipe: " + equipes.get(s));
		}*/
	
		
		HashMap<String, String[]> equipes = new HashMap<String, String[]>();
		
		equipes.put("Rd", new String[] {"Red Bull v11", "Red Bull v10"});
		equipes.put("Mc", new String[] {"McLaren v11", "McLaren v8"});
		equipes.put("Mr", new String[] {"Mercedes v10", "Mercedes v8"});
		equipes.put("Wl", new String[] {"Willians v8", "Willians v8"});
		equipes.put("Fr", new String[] {"Ferrari v11", "Ferrari v11"});
		
		for (String s : equipes.keySet()) {
			
			String[] sigla = equipes.get(s);
			String concat = String.join(" -_ ", sigla);
					
			System.out.println("\nSigla " + s +
					" >Carros: " + concat);
		}

	}

}
