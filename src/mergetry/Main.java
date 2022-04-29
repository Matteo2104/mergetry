package mergetry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader;
		String input;
		while (true) {
			try {
				System.out.println("inserire un input: ");
				reader = new BufferedReader(new InputStreamReader(System.in));
				input = reader.readLine();
			} catch (Exception e) {
				throw new RuntimeException("attenzione errore");
			}
			System.out.println(input);
		}
		
	}
}
