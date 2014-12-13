package praktikum9;

import praktikum5.Meetodid;
import lib.TextIO;

public class Tulpdiagramm {

	public static void main(String[] args) {
		ArrayList<Integer> arvud = kasutajaSisestused();

	}
	
	private static ArrayList<Integer> kasutajaSisestused() {
		ArrayList<Integer> sisestused = new ArrayList<Integer>();
		while (true) {
			System.out.println("Palun sisesta arv");
			int sisestus
				= Meetodid.kasutajaSisestus(0, Integer.MAX_VALUE);
			if (sisestus == 0) {
				break;
			}
			sisestused.add(sisestus);
		}
		return sisestused;
	}

}
