package praktikum5;

import lib.TextIO;

public class Meetodid {

	public static void main(String[] args) {
		System.out.println("Palun sisesta arv  0-1");
		int arv = kasutajaSisestus(0, 1);
		System.out.println(arv);
		
	}

	public static int kuup(int arv) {
		int arvKuubis = (int) Math.pow(arv, 3);
		return arvKuubis;
	}

	public static int kasutajaSisestus(int min, int max) {
	
		int sisestus = TextIO.getlnInt();
		if (sisestus < min || sisestus > max) {
			System.out.println("Vigane sisestus. Palun sisesta uuesti");
			sisestus = TextIO.getlnInt();
		}
		return sisestus;

	}
	public static int suvalineArv(int min, int max) {
		
	}
	 public static double ruutudeSumma (double a, double b) {
		 double summa = (a * a) + (b * b);
		 return summa;
	 }
}