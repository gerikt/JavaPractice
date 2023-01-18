package CollectionsExcercises;
import java.util.*;

public class Problem07 {

	//find a specific element
	
	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();
		
		color.add("Blue");
		color.add("Black");
		color.add("Black");
		color.add("White");
		
		if(color.contains("Blue"))
		{
			System.out.println("Found the element");
		}
		else
		{
			System.out.println("There is no such element ");
		}
	}

}
