package praktikum3;

import lib.TextIO;

public class Tehisintellekt {

	public static void main(String[] args) {

		System.out.println("Palun sisesta esimene vanus");
		int vanus1 = TextIO.getlnInt();
		while (vanus1 > 120 || vanus1 < 10) {
			System.out.println("Kindel? Sisesta uuesti");
			vanus1 = TextIO.getlnInt();
		}
		System.out.println("Palun sisesta teine vanus");
		int vanus2 = TextIO.getlnInt();
		while (vanus2 > 120 || vanus2 < 10) {
			System.out.println("Kindel? Sisesta uuesti");
			vanus2 = TextIO.getlnInt();
		}

		if (vanus1 - vanus2 > 10 || vanus2 - vanus1 > 10)
			System.out.println("midagi krõbedamat");

		else if (vanus1 - vanus2 > 5 || vanus2 - vanus1 > 5)
			System.out.println("midagi krõbedat");

		else
			System.out.println("sobib");

	}
}
