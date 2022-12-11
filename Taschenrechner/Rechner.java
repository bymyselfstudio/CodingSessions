import java.util.Scanner;

public class Rechner{
	static char op;
	static double num1;
	static double num2;
	static double erg;
	static char abfrage;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		titel("RECHNER");

		//do {
		System.out.print("Eingabe Operator\n" +
			"[a]ddition\n[s]ubtraktion\n" +
			"[m]ultiplikation\n[d]ivision\n" + 
			"Eingabe erste Zahl\n" + 
			"Eingabe zweite Zahl\n"
		);
		einlesen();
		berechne();
		ausgeben();

		System.out.println("Weiter?");
		
		abfrage = sc.next().charAt(0);
		sc.close();
		//} while(abfrage != 'n');

		
		System.out.println("\n\tPROGRAMM WURDE BEENDET...");
	}

	static void einlesen(){
		Scanner sc = new Scanner(System.in);
		op = sc.next().charAt(0);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		sc.close();
	}

	static boolean berechne(){

		if (!(op == 'a' || op == 's' || op == 'm' || op == 'd')) { 
			return false; 
		}

		switch (op) {
			case 'a':
				erg = num1 + num2;
				return true;
			case 's':
				erg = num1 - num2;
				return true;
			case 'm':
				erg = num1 * num2;
				return true;
			case 'd':
				if (num2 != 0){
					erg = num1 / num2;
					return true;
				} else { 
					return false; 
				}
		}

		return false;
	}
	
	static void ausgeben(){
		if (berechne()) {
			System.out.println(erg);
		} else { 
			System.out.println(op + " Fehlerhafte Eingabe!");
		}
	}

	static void titel(String _titel){
		System.out.println(_titel);
		for (int i = 0; i < _titel.length(); i++) {
			System.out.print("=");
		}
		System.out.println("\n");
	}

}



