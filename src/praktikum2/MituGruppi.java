package praktikum2;

import lib.TextIO;

public class MituGruppi {
	public static void main(String[] args) {
		int inimesteArv;
		int grupiSuurus;
		int grupid;
		int j22k;
		
		System.out.println("Palun sisesta inimeste arv");
		inimesteArv = TextIO.getInt();
		System.out.println("Palun sisesta grupi suurus");
		grupiSuurus = TextIO.getInt();
		
		grupid = inimesteArv / grupiSuurus;
		j22k = inimesteArv % grupiSuurus;
		
		System.out.println("Saab moodustada " + grupid +  " gruppi.");
		System.out.println("‹le j‰‰b " + j22k + " inimest.");
		
	}

}