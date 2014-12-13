package praktikum3;

import lib.TextIO;

public class CumLaude {

	public static void main(String[] args) {

		System.out.println("Palun sisesta keskmine hinne");
		double keskmineHinne = TextIO.getlnDouble();
		while (keskmineHinne < 0 || keskmineHinne > 5) {
			System.out.println("Vigane sisestus! Sisesta keskmine hinne");
			keskmineHinne = TextIO.getlnDouble();
		}

		System.out.println("Palun sisesta lõputöö hinne");
		int l6put88Hinne = TextIO.getlnInt();
		while (l6put88Hinne < 0 || l6put88Hinne > 5) {
			System.out.println("Vigane sisestus! Sisesta lõputöö hinne");
			l6put88Hinne = TextIO.getlnInt();
		}

		if (keskmineHinne >= 4.5 && l6put88Hinne == 5) {
			System.out.println("Cum Laude!");
		} else {
			System.out.println("Ei saa!");
		}
	}

}
