package praktikum6;

import praktikum5.Meetodid;

public class KullKiri {

	public static void main(String[] args) {
		int kasutajaRaha = 100;
		while (kasutajaRaha > 0) {

			System.out.println("Sisesta panus 1- 25: ");
			int panus = Meetodid.kasutajaSisestus(1, 25);
			kasutajaRaha = kasutajaRaha - panus;

			int vise = Arva2ra.suvalineArv(0, 1);
			// 0 = kull, 1 = kiri
			if (vise == 0) {
				System.out.println("Võitsid");
				kasutajaRaha += 2 * panus;
			} else {
				System.out.println("Kaotasid");
				}
			System.out.println("raha :" + kasutajaRaha);
		}

	}
}
