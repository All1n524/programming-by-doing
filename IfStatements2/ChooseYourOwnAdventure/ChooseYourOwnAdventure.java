//If Statements 2 Choose Your Own Short Adventure 60 points Allen Hung

import java.util.Scanner;

public class ChooseYourOwnAdventure {
  public static void main(String[]  args) {
  Scanner keyboard = new Scanner(System.in);
  String one, two, three;
  System.out.println("WELCOME TO Allen's TINY ADVENTURE!");
  System.out.println("");
  System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
  System.out.println("> ");
  one = keyboard.next();
        System.out.println();
        if (one.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side");
            System.out.println("there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\"");
            System.out.print("> ");
            two = keyboard.next();
            System.out.println();
            if (two.equalsIgnoreCase("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty.");
                System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.print("> ");
                three = keyboard.next();
                System.out.println();
                if (three.equalsIgnoreCase("yes")) {
                    System.out.println("You eat the food and develop a stomach ache.");
                } else {
                    System.out.println("You die of starvation... eventually.");
                }
            } else {
                System.out.println("You died. You triggered a bomb inside the cabinet.");
            }
        } else {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            System.out.print("> ");
            two = keyboard.next();
            System.out.println();
            if (two.equalsIgnoreCase("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? ike to open the door? (\"yes\" or \"no\")");
                System.out.print("> ");
                three = keyboard.next();
                System.out.println();
                if (three.equalsIgnoreCase("yes")) {
                    System.out.println("You open the door and see a pot of gold! You instantly become a millionaire! ");
                } else {
                    System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing,");
                    System.out.println("I'm tired of making nested if statements.");
                }
            } else {
                System.out.println("You are inside the bathroom and you see a shower curtain covering a bathtub.");
                System.out.println("Do you want to uncover the shower curtain and check? (\"yes\" or \"no\")");
                System.out.println("> ");
                three = keyboard.next();
                System.out.println();
                if (three.equalsIgnoreCase("yes")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
        }

}

}
