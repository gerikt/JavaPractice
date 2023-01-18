package CollectionsExcercises;
import java.util.*;

public class ArrayList10 {
//shuffle elements in a array list
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		
		color.add("Blue");
		color.add("White");
		color.add("Black");
		color.add("Green");
		color.add("Brown");
		
		System.out.println("Initialy is :          " + color);
		Collections.shuffle(color);
		System.out.println("After the shuffle is : " + color);
		
	}

}
