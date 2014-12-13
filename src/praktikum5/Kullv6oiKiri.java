package praktikum5;

import lib.TextIO;

public class Kullv6oiKiri {

	public static void main(String[] args) {

		int sisestus = kasutajaSisestus(
				"Sisesta kull (0) või kiri (1)", 0, 1);
		int arvuti = (int) (Math.random() * 2);

		if (arvuti == sisestus) 
			System.out.println("Ära arvasid!");
		else 
			System.out.println("Mööda!");
		
	}
	public static int kasutajaSisestus(String kys, int min, int max) {
		
		int sisestus = TextIO.getlnInt();
		if (sisestus < min || sisestus > max) {
			System.out.println("Vigane sisestus. Palun sisesta uuesti");
			sisestus = TextIO.getlnInt();
		}
		return sisestus;

	}
}


