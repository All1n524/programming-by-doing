//ArrayList Sorting An Array List String 150 points Allen Hung
import java.util.*;
import java.util.Random;
import java.util.Collections;
public class SortingAnArrayListString {
    public static void main( String[] args ) {
        Random r = new Random();
        ArrayList<String> arl = new ArrayList<String>();
        arl.add("syusetu");
        arl.add("hololive");
        arl.add("crazyraccoon");
        arl.add("kohaku");
        arl.add("milk");
        arl.add("sakamata");
        arl.add("chloe");
        arl.add("amatsuka");
        arl.add("uto");
        arl.add("selly");

        System.out.print("Before: ");
        System.out.println(arl);

        Collections.sort(arl);
        // Collections.reverse(arl);
        System.out.print("After: ");
        System.out.println(arl);

    }

}
