//Nested Loops More Number Puzzle 100 points Allen Hung
import java.util.Scanner;
public class MoreNumberPuzzle{
	public static void main(String[] args){

  Scanner keyboard = new Scanner(System.in);
  int choice;
do{
  System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
  System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
  System.out.println("3) Quit");
  System.out.print("which number? \"pick a number\"  ");
   choice = keyboard.nextInt();

 if (choice ==1)
  {

	for ( int a = 10; a < 100; a ++ )
		{
			for ( int b = 10; b < 100; b++ )
			{
				if ( (a + b) == 60 && (a - b) == 14 )
					System.out.println( "(" + a + ", " + b + ")" );
			}
		}

  }


  if (choice ==2 )
  {
    for ( int tens = 1;  tens < 10; tens ++ )
      {

        for (int ones = 1; ones < 10; ones ++)
        {
          if ((tens*10+ones)-(ones*10+tens)== tens+ones)
          {
            System.out.println((tens*10)+ ones);
          }
        }
      }

  }



} while (choice!=3);



	}
}
