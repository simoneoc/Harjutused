package praktikum7;

import lib.TextIO;

public class KymmeArvu {

	public static void main(String[] args) {

		int suurus = 10;
		System.out.println("Sisesta " + suurus + " arvu");
		int[] arvud = new int[suurus];
		for (int i = 0; i < arvud.length; i++) {
			System.out.println("Sisesta " + (i + 1) + " arv:");
			arvud[i] = TextIO.getlnInt();
		}

		System.out.println(arvud);
		for (int i = 0; i < arvud.length; i++) {
			System.out.println(arvud[arvud.length - i + 1]);

		}

	}
}
