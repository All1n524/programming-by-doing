//Arrays Is It There or Not? 85 points Allen Hung
import java.util.*;
public class IsItThereOrNot
{
    public static void main (String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int a[] = new int [10];
        System.out.print("Aray: ");
        for (int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt(50);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        int value = keyboard.nextInt();
        boolean found = false;
        System.out.println();
        for (int i=0; i<a.length; i++)
        {
            if (a[i] == value)
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println(value + " is in the array.");
        }
        else
        {
            System.out.println(value + " is not in the array.");
        }
    }
}
