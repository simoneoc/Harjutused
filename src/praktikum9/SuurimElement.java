package praktikum9;

public class SuurimElement {

	public static void main(String[] args) {

		int[][] neo = { { 1, 3, 6, 7 }, { 2, 3, 3, 1 }, { 17, 4, 5, 0 },
				{ -20, 13, 16, 17 } };

		System.out.println(leiaSuurim(neo));

	}

	public static int leiaSuurim(int[][] sisend) {
		int suurim = Integer.MIN_VALUE;
		for (int i = 0; i < sisend.length; i++) {
			int reaSuurim = leiaSuurim(sisend[1]);
			if (reaSuurim > suurim)
				suurim = reaSuurim;
					}
		return suurim;
	}

	public static int leiaSuurim(int[] sisend) {
		int seniSuurim = Integer.MIN_VALUE;
		for (int i = 0; i < sisend.length; i++) {
			if (sisend[i] > seniSuurim) {
				seniSuurim = sisend[i];
			}
		}
		return seniSuurim;

	}
}
