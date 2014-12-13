package praktikum3;

import lib.TextIO;

public class Parool {
	public static void main(String[] args) {
		String pass = "parool";
		System.out.println("Palun sisesta parool");
		String pass2 = TextIO.getln();
		if (pass2.equals(pass)) {
		System.out.println("OK!");
		} else {
			System.out.println("Vale!");
		}
		

	}
}
