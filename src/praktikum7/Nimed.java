package praktikum7;

public class Nimed {

	public static void main(String[] args) {

		ArrayList<String> nimed = new ArrayList<>();
		while (true) {
			System.out.println("Sisesta nimi");
			String sisestus = TextIO.getlnString();
			
			sisestus = sisestus.trim();
			
			if ("".equals(sisestus)) {
				break;
			}
			
			nimed.add(sisestus);			
		}
		System.out.println(nimed);
		
	}

}
