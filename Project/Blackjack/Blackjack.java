import java.util.Random;
import java.util.Scanner;

public class Blackjack
{
  public static void main(String[] args)
    {

      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      int n1 = 2+ r.nextInt(9);
      int n2 = 2+ r.nextInt(9);
      int total = n1+n2;
      String answer;
do {
      System.out.println("Welcome to Mitchell's blackjack program!");
      System.out.println("You get a " + n1 + " and a " + n2 + ".");
      System.out.println("Your total is " + total + ".");
      System.out.println("");

      int d1 = 2+ r.nextInt(9);
      int hiddencard= 2+ r.nextInt(9);
      int total1 = d1 + hiddencard;
      System.out.println("The dealer has a " + d1 + " showing, and a hidden card.");
      System.out.println("His total is hidden, too.");
      System.out.println("");

do
  {
      System.out.print("Would you like to \"hit\" or \"stay\"? (Remember to stop hitting if your number is bigger than 21.) ");
      String decision1 = keyboard.next();
      if (decision1.equalsIgnoreCase("hit"))
      {
        n1 = 2+r.nextInt(9);
        System.out.println("You drew a " + n1 + ".");
        total = total + n1;
        System.out.println("Your total is " + total + ".");
      }
      else if (decision1.equalsIgnoreCase("stay"))
      {
        break;
      }

  } while (total<=21);

      System.out.println("");

      System.out.println("Okay, dealer's turn.");
      System.out.println("His hidden card was a " + hiddencard + ".");
      System.out.println("His total was " + total1 + ".");

      do
        {
        System.out.println("Dealer chooses to hit.");
        d1 = 2+r.nextInt(9);
        System.out.println("He draws a " + d1 + ".");
        total1 = total1 + d1;
        System.out.println("His total is " + total1 + ".");
      }  while (total1 <= 15);

      if (total1 > 15)
      {
        System.out.println("Dealer stays.");
      }

      System.out.println("");

      System.out.println("Dealer total is " + total1 + ".");
      System.out.println("Your total is " + total + ".");
      System.out.println("");

      if (total>total1 && total<=21) //if your card is smaller than 21 and bigger than dealer
      {
        System.out.println("YOU WIN!");
        System.out.print("Do you want to play again?");
        answer = keyboard.next();
      }

      if (total1>21 && total<=21) // if dealer card bigger than 21 and your card smaller than 21.
      {
        System.out.println("YOU WIN!");

      }

      if (total> 21 && total1<=21) //if you bigger than 21 and dealer smaller 21.
      {
        System.out.println("Sorry, you lost");

      }

      if (total> 21 && total1>21) //if both bigger than 21
      {
        System.out.println("There is no winner");

      }

      if (total==total1) //if both same number
      {
        System.out.println("It's a draw!!");

      }

      System.out.print("Do you want to play again? ");
      answer = keyboard.next();

    } while(answer.equalsIgnoreCase("yes"));

  }

}
