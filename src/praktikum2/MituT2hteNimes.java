package praktikum2;

import lib.TextIO;

public class MituT2hteNimes {

	public static void main(String[] args) {
		System.out.println("Sisesta nimi");
		String nimi = TextIO.getlnString();
		int nimePikkus = nimi.length();
		System.out.println("Nimes on " + nimePikkus + " tähte!");

	}

}
