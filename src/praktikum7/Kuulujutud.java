package praktikum7;

public class Kuulujutud {

	public static String suvaline(String[] massiiv) {
		int suvalineIndeks = (int) (Math.random() * massiiv.length);
		return massiiv[suvalineIndeks];
	}

	public static void main(String[] args) {

		String[] naised = { "Mari", "Kati", "Tiina" };
		String[] mehed = { "Mati", "Mart", "Toomas" };
		String[] tegus6nad = { "magavad", "joovad", "s88vad" };

		System.out.println(suvaline(naised) + " ja " + suvaline(mehed) + " "
				+ suvaline(tegus6nad));

	}

}
