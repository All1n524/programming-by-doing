//Do while loops again with the number-guessing 35 points Allen Hung
import java.util.Random;
import java.util.Scanner;

public class AgainWithNumberGuessing
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int correct = 1 + r.nextInt(10);
		int tries = 0;

		System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );

		do
		{
			System.out.print( "Your guess: " );
			guess = keyboard.nextInt();
			tries++;
			if ( correct != guess )
				System.out.println( "That is incorrect. Guess again." );
		} while ( correct != guess );

		System.out.println( "That's right! You're a good guesser." );
		System.out.println( "It only took you " + tries + " tries." );
	}
}
