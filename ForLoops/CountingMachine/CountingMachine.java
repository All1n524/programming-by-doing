//For loops Counting Machine 20 pts Allen Hung
import java.util.Scanner;

public class CountingMachine
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int user = keyboard.nextInt();

        for ( int n = 0 ; n <= user ; n++ )
        {
            System.out.print( n + " " );
        }

    }
}
