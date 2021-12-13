//Do while loops flip again? 20 points Allen Hung
//Yes, because it's no longer while loop which has to meet a certain criteria in order to be executed.
import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		String again;
		String coin;

		do
			{
			int flip = r.nextInt(2);


			if ( flip == 1 ) {
				coin = "HEADS"; }
			else {
				coin = "TAILS"; }

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		} while (again.equalsIgnoreCase("y"));

	}
}
