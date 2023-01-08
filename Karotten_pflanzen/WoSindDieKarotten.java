// Karotten in Reihe pflanzen in Anlehnung an Stardew Valley ;)
// Vorbereitung auf die eigentliche Aufgabe --> Array2D.java

import java.util.Scanner;

class WoSindDieKarotten {
	public static void main(String[] args) {
		PflanzenUndAuflisten p = new PflanzenUndAuflisten();
		p.titel("KAROTTEN PFLANZEN");
		p.einlesen();
		p.ausgeben();
	}
}

class PflanzenUndAuflisten {
	int reihenlaenge;
	char unbesetzt = '.';
	char karotte = 'x';
	char[] reihe;

	void einlesen() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte Reihenlänge eingeben: ");
		reihenlaenge = sc.nextInt();
		
		reihe = new char[reihenlaenge];

		for (int j = 0; j < reihe.length; j++) {
			System.out.print("Soll an Platz " + j + " eine Karotte gepflanzt werden? [j]a oder [n]ein: ");
			char hierPflanzen = sc.next().charAt(0);

			if(hierPflanzen == 'j') {
				reihe[j] = karotte;
				// System.out.println(reihe[j]); // debug
			} else {
				reihe[j] = unbesetzt;
				// System.out.println(reihe[j]); // debug
			}
		}

		sc.close();
	}

	void ausgeben() {
		System.out.println(); // Leerzeile
		System.out.println("An folgenden Stellen wurden Karotten gepflanzt: \n");
		for (int i = 0; i < reihe.length; i++) {
			System.out.print(reihe[i] + " ");
		}
		System.out.println();
	}

	void titel(String _titel) {
		System.out.println(_titel);
		for (int i = 0; i < _titel.length(); i++) {
			System.out.print('=');
		}
		System.out.println("\n");
	}
}