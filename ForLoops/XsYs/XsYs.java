//For loops Xs and Ys 15 pts Allen Hung
public class XsYs
{
	public static void main( String[] args )
	{

		System.out.println( "x  	y" );
		System.out.println( "----------" );

		for ( double x = -10.0; x <= 10.0; x += 0.5 )
		{
			double y;
			y= x*x;
			System.out.print(x);
			System.out.println("	" + y);
		}
	}
}
