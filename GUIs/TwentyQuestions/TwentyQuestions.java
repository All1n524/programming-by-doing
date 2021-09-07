import java.util.Scanner;
public class TwentyQuestions
{
  public static void main(String[]  args)
  {
    Scanner keyboard = new Scanner(System.in);
    String type, size, guess;

    System.out.println("TWO QUESTIONS");
    System.out.println("Question 1) Is it animal, vegetable, or mineral?");
    type = keyboard.next();// Define type

    System.out.println("Question 2) Is it bigger than a breadbox? \"yes or no \" ");
    size = keyboard.next();
    if (type.equalsIgnoreCase("animal"))
    {
      if(size == "yes")
      {
        guess = "moose";
    } else {
        guess = "squirrel";
    }
    }
    if (type.equalsIgnoreCase("vegetable"))
    {
      if (size == "yes")
      {
        guess = "watermelon";
      } else {
        guess = "carrot";
      }
    }
    if(type.equalsIgnoreCase("mineral"))
      {
        if (size == "yes")
        {
          guess = "Camaro";
        } else {
          guess = "paper clip";
        }
      }
      System.out.println("My guess is that you are thinking of a" + guess + ".");
  }
}
