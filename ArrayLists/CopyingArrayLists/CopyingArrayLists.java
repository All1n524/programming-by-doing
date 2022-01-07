//ArrayLists Copying ArrayLists 55 points Allen Hung
import java.util.*;
public class CopyingArrayLists
{
    public static void main(String[]args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
        {
            list.add(getNumbers());
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list);
        list.set(list.size()-1, -7);
        System.out.print("ArrayList 1: " + list);
        System.out.println();
        System.out.print("ArrayList 2: " + list2);
    }
    public static int getNumbers()
    {
        Random r = new Random();
        int x = 1+r.nextInt(100);
        return x;
    }
}
