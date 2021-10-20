import java.util.Scanner;

public class date {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a1, a2, a3;
        System.out.println("Enter the Year:");
        a1 = keyboard.nextDouble();
        if (a1>2022 || a1<1920)
        {
          System.out.println("Enter the Year:");
          a1 = keyboard.nextDouble();
        }
        else
        {
          System.out.println("Enter the Month:");
          a2 = keyboard.nextDouble();
          if (a2 >12 || a2<1)
          {
            System.out.println("Enter the Month:");
            a2 = keyboard.nextDouble();
          }
          else{
            System.out.println("Enter the Day:");
            a3 = keyboard.nextDouble();
            if (a3>30 || a3<1){
              System.out.println("Enter the Day:");
              a3 = keyboard.nextDouble();
            }
            else {
              System.out.println("Your Birthday is "+a1+ "/" + a2 + "/" + a3 );
            }
          }
        }

    }
}
