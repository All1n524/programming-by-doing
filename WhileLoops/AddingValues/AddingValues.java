//While Loops Adding Values In A Loop 30 pts Allen Hung
import java.util.Scanner;
public class AddingValues
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "I will add up the numbers you give me." );
        System.out.print( "Number: " );
        int num = keyboard.nextInt();
        int sum = num;
        while (num!=0)
        {
            System.out.println( "The total so far is " + sum );
            System.out.print( "Number: ");
            num = keyboard.nextInt();
            sum = num+sum;
        }
        System.out.println();
        System.out.println( "The total is " + sum + "." );

    }
}
