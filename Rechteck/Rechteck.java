import java.util.Scanner;

public class Rechteck {
	static byte breite;
	static byte hoehe;
	static String fuell;

	public static void main(String[] args) {
		System.out.println("Parameter eingeben:\n" +
			"Breite\n" +
			"Höhe\n" +
			"Füllelement");	
		read();
		draw();
	}

	static void read(){
		Scanner sc = new Scanner(System.in);
		breite = sc.nextByte();
		hoehe = sc.nextByte();
		fuell = sc.next();
		sc.close();
	}

	static void draw(){
		for (int i=0; i<hoehe; i++) {
			if(i==0 || i==hoehe-1){
				obenUndUnten();
			} else {
				seitenUndFuellung();
			}
			System.out.println();
		}
	}

	static void obenUndUnten(){
		for(int i=0; i<breite; i++){
			if(i==0 || i==breite-1){
				System.out.print('+');
			} else {
				System.out.print('-');
			}
		}
	}

	static void seitenUndFuellung(){
		for(int i=0; i<breite; i++){
			if(i==0 || i==breite-1){
				System.out.print('|');
			} else {
				System.out.print(fuell);
			}
		}
	}
}


