//Random Numbers Randomness 15 points Allen Hung
// answer to the first question: after deleting 1, the range is from 0 to 5.
// answer to the second question: after adding 3, the range is from 3 to 8.
// I notice that Random r = new Random(12353) does not affect the final result.
// When I change it to other numbers, the result still doesn't change.
import java.util.Random;

public class Randomness
{
	public static void main ( String[] args )
	{
		Random r = new Random(12353);

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}
