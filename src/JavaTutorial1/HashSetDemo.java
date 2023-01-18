package JavaTutorial1;
import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("D");

		System.out.println(hashSet);
		
		
		for(String item : hashSet)
		{
			System.out.println(item);
		}
	}

}
