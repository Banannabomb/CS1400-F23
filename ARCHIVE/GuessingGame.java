//
// Name: Lin, Alex
// Project: 2
// Due: 10/3/2023
// Course: cs-1400-02-f23
//
// Description:
// A guessing game where the user must guess a random number between 1 and 100
//


import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
	public static void main(String[] args) {
		final int quitValue = 0;
		Random rand = new Random();
		int guessCount = 1;
		int guessValue;
		Scanner keyboard = new Scanner(System.in);
		if (args.length > 0){
			rand.setSeed(Long.valueOf(args[0]));
		}
		int secretValue = rand.nextInt(100) + 1;
		System.out.printf("DEBUG: Secret value is %d \n", secretValue);
		System.out.println("Guess My Number Game by A. Lin");
		System.out.println("A secret number between 1-100 has been generated...");
		System.out.println("Enter guess 0 to quis.\n");
		System.out.print("Enter your guess? ");
		guessValue = keyboard.nextInt();
		while (guessValue != secretValue){
			if(guessValue == quitValue) {
				System.out.printf("The secret number is %d.\n", secretValue);
				return;
			}
			else if(guessValue < secretValue){
				System.out.println("Guess is low, try again.");
				System.out.print("Enter your guess? ");
				guessValue = keyboard.nextInt();
				guessCount++;
			}
			else{
				System.out.println("Guess is high, try again.");
				System.out.print("Enter your guess? ");
				guessValue = keyboard.nextInt();
				guessCount++;
			}
		}
		if (guessValue == secretValue) {
			if (guessCount == 1){
			System.out.println("Congratulations, you got it in 1 guess!");
			}
			else{
			System.out.printf("Correct in %d guesses.\n", guessCount);
			}
			
		}

	}

}