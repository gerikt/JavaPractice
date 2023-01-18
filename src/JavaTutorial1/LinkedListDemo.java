package JavaTutorial1;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.addLast("C");
		list.addFirst("D");
		list.add(2,"E");
		
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);

		list.remove(3);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

	}

}
