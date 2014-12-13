package praktikum8;

public class Palindroom {
	public static boolean onPalindroom(String sona) {
		return sona.equals(tagurpidi(sona));
	}

	public static String tagurpidi(String sona) {
//		StringBuilder builder = new StringBuilder(sona);
//		builder.reverse();
//		return builder.toString();
		String tulemus = "";
		
		for (int i = 0; i < sona.length(); i++) {
			char taht = sona.charAt(i);
			tulemus = taht + tulemus;
		}
		
		return tulemus;
	}

	public static void main(String[] args) {
		System.out.println("Sisesta sõna");
		String sona = TextIO.getlnString();
		System.out.println(tagurpidi(sona));
		System.out.println(onPalindroom(sona));
	}

}
