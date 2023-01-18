package CollectionsExcercises;
import java.util.*;

public class Problem08 {

	//create a list and sort it
	
	public static void main(String[] args) {

		List <String> color = new ArrayList<String>();
		
		color.add("Black");
		color.add("White");
		color.add("Red");
		color.add("Blue");
		
		System.out.println("Before sorting is : " + color);
		
		Collections.sort(color);
		System.out.println("After sorting is :  " + color);
	}

}
