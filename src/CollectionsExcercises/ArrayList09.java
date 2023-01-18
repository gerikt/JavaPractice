package CollectionsExcercises;
import java.util.*;

public class ArrayList09 {
//write a program to copy one array list into another
	
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		System.out.println("List 1 is : " +list1);
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		
		System.out.println("List 2 is : " + list2);
		
		Collections.copy(list1, list2);
		//This one is copying list 2 to list 1
		
		System.out.println("List 1 :" + list1);
		System.out.println("List 2 :" + list2);
		
	}

}
