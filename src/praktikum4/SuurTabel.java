package praktikum4;

public class SuurTabel {

	public static void main(String[] args) {
		

		for (int i = 0; i <= 9; i++) {
			for (int j = i; j <= 9; j++) {

				System.out.print(j + "  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}

	}

}
