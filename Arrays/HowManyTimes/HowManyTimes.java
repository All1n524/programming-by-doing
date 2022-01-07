//Arrays How Many Times? 40 points Allen Hung
import java.util.*;
public class HowManyTimes
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int a[] = new int [10];
        int count = 0;
        System.out.print("Array: ");
        for (int i=0; i<a.length; i++)
        {
            a[i]= r.nextInt(50);
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        int value = keyboard.nextInt();
        System.out.println();
        for (int i=0; i<a.length; i++)
        {
            if (a[i] == value)
            {
                count++;
            }
        }
        System.out.println(value + " was found " + count + " times.");
    }
}
