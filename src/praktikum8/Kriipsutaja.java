package praktikum8;

public class Kriipsutaja {
	public static String kriips(String rida) {
		String tulemus = "";
		
		String[] sonad = rida.trim().split(" ");
		
		for (int j = 0; j < sonad.length; j++) {
			String sona = sonad[j];
			if ("".equals(sona)) {
				continue;
			}
			
			if (j != 0) {
				tulemus += "_";
			}
			for (int i = 0; i < sona.length(); i++) {
				char taht = sona.charAt(i);
				if (i != 0) {
					tulemus += "-";
				}
				tulemus = tulemus + taht;
			}
		}
		
		return tulemus.toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(kriips("kala"));
		
		String sona = TextIO.getlnString();
		System.out.println(kriips(sona));
	}
}
