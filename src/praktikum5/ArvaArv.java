package praktikum5;

import lib.TextIO;

public class ArvaArv {

	public static void main(String[] args) {

		

		System.out.println();
		System.out.println("Lets play a game.  I´ll pick a number");
		System.out.println("between 1 and 100, and you try to guess it.");
		System.out.println();

		do {
			playGame();
			

		} while (computersNumber != usersNumber);

	}
	static void playGame() {
		int computersNumber = (int) (Math.random() * 100 + 1);
		int usersNumber;
		System.out.println("Enter your guess: ");
		usersNumber = TextIO.getInt();

		if (computersNumber == usersNumber)
			System.out.println("You won! congrats!");
		else if (computersNumber > usersNumber)
			System.out.println("Guess too low!");
		else if (computersNumber < usersNumber)
			System.out.println("Guess too high!");
	}
}
