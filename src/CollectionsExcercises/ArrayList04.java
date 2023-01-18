package CollectionsExcercises;

import java.util.*;

public class ArrayList04 {

	//Retrieve an element at a specified index
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		
		color.add("White");
		color.add("Black");
		color.add("Blue");
		color.add("Red");
		color.add("Green");
		
		System.out.println(color);
		System.out.println("The element at the position 3 is : " + color.get(3));
	}

}
