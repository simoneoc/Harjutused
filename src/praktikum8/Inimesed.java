package praktikum8;

public class Inimesed {

	public static void main(String[] args) {
		ArrayList<Inimene> inimesed = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Sisesta nimi [tühik] vanus");
			String rida = TextIO.getlnString();
			String[] sonad = rida.split(" ");
			
			try {
				String nimi = sonad[0];
				int vanus = Integer.parseInt(sonad[1]);
				
				Inimene m = new Inimene(nimi, vanus);
				inimesed.add(m);
			}
			catch (Exception e) {
				System.out.println("tekkis viga, inimest ei sisestatud: " + e);
			}
		}
		
		for (Inimene inimene : inimesed) {
			inimene.tervita();
		}

	}

}
