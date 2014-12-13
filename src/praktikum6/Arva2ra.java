package praktikum6;

import praktikum5.Meetodid;

public class Arva2ra {

	public static void main(String[] args) {
		int arvutiM6tles = suvalineArv(1, 100);
		int kasutajaArvab;
		do {
			System.out.println("Sisesta number 1 kuni 100");
			kasutajaArvab = Meetodid.kasutajaSisestus(1, 100);
			if (arvutiM6tles > kasutajaArvab)
				System.out.println("Number liiga väike");
			if (arvutiM6tles < kasutajaArvab)
				System.out.println("Number liiga suur");
			if (arvutiM6tles == kasutajaArvab)
				System.out.println("Ära arvasid!");
		} while (kasutajaArvab != arvutiM6tles);
	}

	public static int suvalineArv(int min, int max) {
		int vahemik = max - min;
		// Math.random() => [0...1) // 0.345633
		// Math.random() * 4 => [0...4) // 3.5878789
		// (int)(Math.random() * 4) => 0, 1, 2,
		int suvaline = (int) (Math.random() * (vahemik + 1));
		return min + suvaline;
	}
}
