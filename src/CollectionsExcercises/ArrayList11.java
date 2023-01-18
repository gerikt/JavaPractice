package CollectionsExcercises;
import java.util.*;

public class ArrayList11 {

	//Reverse the elements in the list
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		
		color.add("White");
		color.add("Black");
		color.add("Blue");
		color.add("Red");
		color.add("Green");
		
		System.out.println("List before reversing is :" +color);
		
		Collections.reverse(color);
		
		System.out.println("List after reversing is : " +color);
	}

}
