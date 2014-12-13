package praktikum4;

import lib.TextIO;

public class Tabel22ristega {

	public static void main(String[] args) {

		System.out.println("Palun sisesta tabeli suurus: ");
		int tabeliSuurus = TextIO.getlnInt();

		for (int i = 0; i < tabeliSuurus; i++) {
			System.out.print("-  ");
		}
		System.out.println();

		for (int j = 0; j < tabeliSuurus; j++) {
			for (int i = 0; i < tabeliSuurus + 2; i++) {
				if (i == 0 || i == tabeliSuurus + 1)
					System.out.print("| ");
				else if (j == i - 1 || i + j == tabeliSuurus)
					System.out.print("x  ");
				else
					System.out.print("0  ");

			}
			System.out.println();
		}
		for (int i = 0; i < tabeliSuurus; i++) {
			System.out.print("-  ");
		}
	}

}
