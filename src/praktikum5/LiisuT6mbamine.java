package praktikum5;

import lib.TextIO;

public class LiisuT6mbamine {

	public static void main(String[] args) {
		System.out.println("Palun sisesta inimeste arv");
		int inimesteArv = TextIO.getInt();
		int liisk = (int) (Math.random() * (inimesteArv) + 1);
		System.out.println(liisk);

	}

}
