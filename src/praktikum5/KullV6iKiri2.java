package praktikum5;

import lib.TextIO;

public class KullV6iKiri2 {

	public static void main(String[] args) {
		int raha;
		int panus;

		raha = 100;
	}

	static int vise(int mynt, int raha, int panus) {
		System.out.println("Sisesta panus");
		panus = TextIO.getInt();
		int mynt = (int) (Math.random() * 2);

		if (mynt == 0)
			raha = raha - panus + 2 * panus;
		else {
			raha = raha - panus;
		}
		return raha;
	}

}
