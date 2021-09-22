//Random Numbers Fortune Cookie 15-25 pts Allen Hung
import java.util.Random;
public class FortuneCookie
{
    public static void main( String[]args )
    {
        Random r = new Random();

        int x = 1 + r.nextInt(60);


        if ( x==10 ) {
        System.out.print( "\"You will be happy\"" );
        }
        else if ( x==20 ) {
            System.out.print( "\"You will be unhappy\"" ); }
        else if ( x==30 ) {
            System.out.print( "\"You will be lucky\"" ); }
        else if ( x==40 ) {
            System.out.print( "\"You will be unlucky\"" );}
        else if ( x==50 ) {
            System.out.print( "\"You will be rich\"" );}
        else if ( x==60 ) {
            System.out.print( "\"You will be poor\"" );}


        if (x!= 10,20,30,40,50,60 ) {
        System.out.print("\"You didn't get the bonus\""); }

        System.out.println( "Fortune cookie says: " + x );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) );


    }
}
