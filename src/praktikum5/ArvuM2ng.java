package praktikum5;

import java.io.ObjectInputStream.GetField;
import java.util.Random;

import lib.TextIO;

public class ArvuM2ng {
	static int gamesPlayed;
	static int gamesWon;

	public static void main(String[] args) {
	
		System.out.println("Lets play a game. I´ll pick a number");
		System.out.println("between 1 and 100, and you try to guess it.");
		boolean playAgain;
		do {
			playGame();
			System.out.println("Would you like to play again?");
			playAgain = TextIO.getlnBoolean();
		} while (playAgain);
		System.out.println();
		System.out.println("You played " + gamesPlayed + "games");
		System.out.println("and you won " + gamesWon + " games");
		System.out.println("Thanks for playing. Goodbye!");
		
	}
	static void playGame() {
		int computersNumber = (int) (Math.random() * 100 + 1);
		int guessCount = 0;
		gamesPlayed++;
		System.out.println();
		System.out.println("Whats your first guess?");
		
	
		while (true) {
			int usersNumber = TextIO.getInt();
			guessCount++;

			if (computersNumber == usersNumber) {
				System.out.println("You have won! It took you " + 
			guessCount + " guesses!");
				gamesWon++;
				
				break;
			}
			if (guessCount == 6) {
				System.out.println("You have lost! The number was " + 
			computersNumber);
				break;
			}
			if (usersNumber < computersNumber) {
				System.out.println("Guess was low. Try again!");
			} else if (usersNumber > computersNumber) {
				System.out.println("Guess too high. Try again!");
			}

		}

	}

}
