package CollectionsExcercises;
import java.util.*;

public class ArrayList12 {

	//extract a portion of an array list
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		
		color.add("Blue");
		color.add("Black");
		color.add("White");
		color.add("Red");
		
		List<String> subList = color.subList(0, 2);
		
		System.out.println("The sublist is : " + subList);
	}

}
