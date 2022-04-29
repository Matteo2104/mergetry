package mergetry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		Interfaccia classe;
		

		BufferedReader reader;
		String input;
		
		System.out.println("inizia il gioco...");
		while (true) {
			try {
				System.out.print(">>> ");
				reader = new BufferedReader(new InputStreamReader(System.in));
				input = reader.readLine();
			} catch (Exception e) {
				throw new RuntimeException("attenzione errore");
			}
			
			switch (input) {
				case "1":
					classe = new Classe1();
					classe.stampa();
					break;
				case "2":
					classe = new Classe2();
					classe.stampa();
					break;
				case "3":
					classe = new Classe3();
					classe.stampa();
					break;
			}
		}
		

	}
}
