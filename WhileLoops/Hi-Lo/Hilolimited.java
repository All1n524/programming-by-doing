//While Loops Hi-Lo WithLimited Tries 55 pts Allen Hung
import java.util.Scanner;
import java.util.Random;

public class Hilolimited {

  public static void main (String[] args)
  {
      Scanner keyboard = new Scanner(System.in);
      Random r = new Random();
      int number = 1 + r.nextInt(100);
      System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
      System.out.print("First guess: ");
      int guess = keyboard.nextInt();
      int seven = 7;
      int tries = 1;
      while (guess!= number && tries<seven)
      {
        if (guess>number)
        {
          System.out.println("Sorry, that guess is too high.");
          tries++;
          System.out.print("Guess # " + tries + ":");
          guess = keyboard.nextInt();
        }
        else if (guess<number)
        {
          System.out.println("Sorry, you are too low.");
          tries++;
          System.out.print("Guess # " + tries + ":");
          guess = keyboard.nextInt();

        }
      }
      while (guess==number && guess<seven)
      {
        System.out.println("You guessed it!  What are the odds?!?");
      }
      if (tries>=seven)
      {
        System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
      }

  }

}
