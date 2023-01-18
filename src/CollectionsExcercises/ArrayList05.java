package CollectionsExcercises;
import java.util.*;

public class ArrayList05 {

	//update specific array element by given element
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String> () ; 
		
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Green");
		
		System.out.println("The initial list is :               " + color);
		
		color.set(3, "Red");
		System.out.println("The list after the replacement is : " + color);
	}

}
