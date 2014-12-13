package praktikum2;

import lib.TextIO;

public class Korrutis {
	public static void main(String[] args) {
		int arv1;// Muutuja deklareerimine
		int arv2;// int -- täisarv
				// arv1 ja arv2 on täisarvud
		int korrutis;
		
		System.out.println("Palun sisesta esimene arv");
		arv1 = TextIO.getInt(); // Muutuja väärtustamine
		
		System.out.println("Palun sisesta teine arv");
		arv2 = TextIO.getInt();
		
		korrutis = arv1 * arv2;
		
		System.out.println("Kahe arvu korrutis on:"
				+ korrutis);
	}
}