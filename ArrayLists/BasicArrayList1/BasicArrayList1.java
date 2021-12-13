//Array List Basic ArrayList 1 Allen Hung 30 points
import java.util.*;
@SuppressWarnings("unchecked")

public class BasicArrayList1{

	public static void main(String[] args){

	ArrayList listTest = new ArrayList();
		listTest.add( "-113" );
		for(int i=0; i<10; i++){
			 System.out.println( "Slot "+i+" contains a " + listTest.get(0) );
		}

	}

}
