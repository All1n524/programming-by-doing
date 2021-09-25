//While Loop Keep Guessing 50 pts Allen Hung
import java.util.Scanner;

public class KeepGuessing
{
	public static void main( String[] args )
	{
			Scanner keyboard = new Scanner(System.in);
			int pin = 6;
			System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
			System.out.print("Your Guess: ");
			int Guess = keyboard.nextInt();

			while (pin!=Guess)
			{
					System.out.println("That is incorrect. Guess again.");
					System.out.print("Your Guess: ");
				  Guess = keyboard.nextInt();

			}
			System.out.println("That's right! You're a good guesser.");



	}


}
