//Functions Area Calculator 110 points Allen Hung
import java.util.Scanner;

public class AreaCalculator
{
  public static void main (String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
int shape;
do  { System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");


	System.out.println();
	System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println();
	System.out.println("1) Triangle");
	System.out.println("2) Rectangle");
	System.out.println("3) Square");
	System.out.println("4) Circle");
	System.out.println("5) Quit");
	System.out.print("Which shape: ");
	 shape = keyboard.nextInt();

  if (shape==1)
  {
    double Base, Height;
    System.out.print("Base: ");
    Base = keyboard.nextDouble();
    System.out.print("Height: ");
    Height = keyboard.nextDouble();
    area_triangle(Base, Height);
  }
  else if ( shape==2 )
  {
    System.out.print("Length: ");
    double Base = keyboard.nextDouble();
    System.out.print("Width: ");
    double Height = keyboard.nextDouble();
    area_rectangle(Base,Height);
  }
  else if ( shape==3 )
  {
    System.out.print("Side length: ");
    double side = keyboard.nextDouble();
    area_square(side);
  }
  else if ( shape== 4)
  {
    double radius;
    System.out.print("Radius: ");
    radius = keyboard.nextDouble();
    area_circle(radius);
  }
  else if ( shape ==5)
  {
    System.exit(0);
  }

	System.out.println();

} while (shape != 5);
  }

  public static double area_triangle ( double Base, double Height )
  {
    double A;
    A = Base*Height/2;
    System.out.println(A);
    return A;
  }

  public static double area_rectangle (double Base, double Height)
  {
    double A;
    A = Base*Height;
    System.out.println(A);
    return A;
  }

  public static double area_square (double side)
  {
    double A;
    A = side*side;
    System.out.println(A);
    return A;
  }

  public static double area_circle (double radius)
  {
    double A;
    A = Math.PI*radius*radius;
    System.out.println(A);
    return A;
  }
}
