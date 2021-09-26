//Do while loops Shorter double dice 40 points Allen Hung
import java.util.Random;
public class ShorterDoubleDice
{
  public static void main(String [] args)
  {
    Random r = new Random();
    System.out.println("HERE COMES THE DICE!");
    int roll1 = 1+r.nextInt(6);
    int roll2 = 1+r.nextInt(6);
    System.out.println("Roll #1: " + roll1);
    System.out.println("Roll #2: " + roll2);
    System.out.println("The total is " + (roll1 + roll2) + "!");

    do {
      roll1 = 1+r.nextInt(6);
      roll2 = 1+r.nextInt(6);
      System.out.println("Roll #1: " + roll1);
      System.out.println("Roll #2: " + roll2);
      System.out.println("The total is " + (roll1 + roll2) + "!");
    } while (roll1!=roll2);


    }


  }
