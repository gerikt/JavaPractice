package JavaTutorial1;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>(5);
		
		for(int i =1; i<=5; i++)
		{
			arr.add(i);
		
		}
			System.out.println(arr);
			
			arr.remove(3);
			
			System.out.println(arr);
			
		
		
		
	}

}
