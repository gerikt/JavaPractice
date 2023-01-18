package CollectionsExcercises;
import java.util.*;

public class Problem06 {

	// Remove an element from the arrayList
	public static void main(String[] args) {

		List<String> color = new ArrayList<String> ();
		
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Green");
		
		System.out.println("The original list is :          " + color);
		
		color.remove(1);
		System.out.println("The list after the removal is : " + color);
		
	}

}
