package praktikum5;

import lib.TextIO;

public class Hinded {

	public static void main(String[] args) {
		
		double punktid;
		
		do {
			System.out.println("Palun sisesta punktisumma:");
			punktid = TextIO.getDouble();
			
		} while (punktid > 100 || punktid < 0);
		}

	}


