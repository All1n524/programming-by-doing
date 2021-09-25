//While Loops Number-Guessing With A Counter 40 pts Allen Kan
import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {

  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
    int correct = 1 + r.nextInt(10);
    System.out.print("Your guess: ");
    int guess = keyboard.nextInt();
    int tries = 1;

    while (guess != correct)
    {
      System.out.println("That is incorrect.  Guess again.");
      System.out.print("Your guess: ");
      guess = keyboard.nextInt();
      tries++;
    }
    if (guess== correct ) {
    System.out.println("That's right!  You're a good guesser.");
    System.out.println("It only took you " + tries + "!");
  }

  }
}
