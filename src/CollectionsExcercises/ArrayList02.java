package CollectionsExcercises;

import java.util.*;

public class ArrayList02 {
	//Create an arrayList and iterate the items on the list

	public static void main(String[] args) {

		List <String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Brown");
		colors.add("White");
		
		for(String element : colors)
		{
			System.out.println(element);
		}
	}

}
