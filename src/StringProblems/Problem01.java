package StringProblems;

public class Problem01 {

	//Write a program to get the character at a specific index within a string
	
	public static void main(String[] args) {

		String str = "Java Excercises!";
		System.out.println("Original String is : " + str);
		int index1 = str.charAt(0);
		int index2 = str.charAt(10);
		
		System.out.println("The character at the position 0 is : " + (char)index1);
		System.out.println("The character at index 10 is : " +(char)index2 );
	}

}
