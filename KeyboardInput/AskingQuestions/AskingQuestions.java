//KeyBoard Input Asking Questions 10 points ALlen Hung
import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height;
		String weight;
		int inch;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.nextInt();

		System.out.print( "And how many inches?" );
		inch = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.next();

		System.out.println( "So, you're " + age + " old, " + height + "'" + inch + " tall and " + weight + " heavy." );
	}
}
