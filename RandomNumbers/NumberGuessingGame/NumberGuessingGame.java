//Random Numbers A Number-Guessing Game 20 points Allen Hung
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main( String[]args)
  {
    Scanner keyboard = new Scanner(System.in);
    int guess;
    String response = "";
    System.out.println("I'm thinking of a number from 1 to 10.");
    System.out.print("Your guess:");
    guess = keyboard.nextInt();

    Random r = new Random();
    int choice = 1 + r.nextInt(10);

    if (guess==choice)
      response = "That's right! My secret number was " + choice + "!";
    else
     response = "Sorry, but I was really thinking of " + choice + ".";

    System.out.print(response);
  }
}
