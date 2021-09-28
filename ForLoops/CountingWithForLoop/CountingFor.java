//For loops Counting with a For Loop 10 pts Allen Hung
//When I remove n = n+1, it will print infinite times.
//int n = 1 defines the variable n, when I remove it, my computer will show "error".

import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 1 ; n <= 5 ; n++ )
        {
            System.out.println( n*2 + ". " + message );
        }

    }
}
