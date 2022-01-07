//Records Basic Records 80 points Allen Hung
import java.util.Scanner;

class Student
{
    String name;
    int grade;
    double avg;
}
public class BasicRecords
{
    public static void main (String[]args)
    {
        Scanner fin = new Scanner (System.in);

        Student one = new Student();
        Student two = new Student();
        Student three = new Student();

        System.out.print("Enter the first student's name: ");
        one.name = fin.next();
        System.out.print("Enter the first student's grade: ");
        one.grade = fin.nextInt();
        System.out.print("Enter the first student's average: ");
        one.avg = fin.nextDouble();
        System.out.println();

        System.out.print("Enter the second student's name: ");
        two.name = fin.next();
        System.out.print("Enter the second student's grade: ");
        two.grade = fin.nextInt();
        System.out.print("Enter the second student's average: ");
        two.avg = fin.nextDouble();
        System.out.println();

        System.out.print("Enter the third student's name: ");
        three.name = fin.next();
        System.out.print("Enter the third student's grade: ");
        three.grade = fin.nextInt();
        System.out.print("Enter the third student's average: ");
        three.avg = fin.nextDouble();
        System.out.println();

        System.out.print("The names are: " + one.name + " " + two.name + " " + three.name);
        System.out.println();
        System.out.print("The grades are: " + one.grade + " " + two.grade + " " + three.grade);
        System.out.println();
        System.out.print("The averages are: " + one.avg + " " + two.avg + " " + three.avg);
        System.out.println();

        double total_avg = ((one.avg+two.avg+three.avg)/3);
        System.out.print("The average for the three students is : " + total_avg);


    }
}
