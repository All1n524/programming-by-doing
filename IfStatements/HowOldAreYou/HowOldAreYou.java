//If Statements How Old Are You? 25 points Allen Hung
import java.util.Scanner;

public class HowOldAreYou {

  public static void main( String[] args) {

    Scanner keyboard= new Scanner(System.in);

    String name;
    int age;
    int drive= 16;
    int vote= 18;
    int rent= 25;

    System.out.print("Hey, what's your name?");
    name= keyboard.next();

    System.out.print("Ok," + name + ",how old are you?");
    age= keyboard.nextInt();

    if ( age < drive )
    {
      System.out.print("You can't drive," + name + ".");
    }
    if ( age < vote )
    {
      System.out.print("You can't vote," + name + ".");
    }
    if ( age < rent )
    {
      System.out.print("You can't rent a car," + name + ".");
    }
  }
}
