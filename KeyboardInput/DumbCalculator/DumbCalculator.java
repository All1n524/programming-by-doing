//KeyBoard Input A Dumb Calculator 20 points ALlen Hung

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    Double number1, number2, number3;
    System.out.print("What is your first number?");
    number1= keyboard.nextDouble();
    System.out.print("What is your second number?");
    number2= keyboard.nextDouble();
    System.out.print("What is your thrid number?");
    number3= keyboard.nextDouble();
    Double solution= (number1+number2+number3)/2;
    System.out.print( "(" + number1 + " + " + number2 + " + " + number3 + ") / 2" + " is... " +  solution );
    }

}
