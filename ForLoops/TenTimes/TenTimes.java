//For loops Ten Times 15 pts Allen Hung
import java.util.Scanner;

public class TenTimes
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String message = "Mr. Mitchell is cool.";

        for ( int n = 1 ; n <= 10 ; n++ )
        {
            System.out.println( n + ". " + message );
        }

    }
}
