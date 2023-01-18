package StringProblems;

//Write a Java program to concatenate a given string to the end of another string 

public class Problem07 {

	public static void main (String [] args)
	{
	String str1 = " Java excercises and" ; 
	String str2 = " selenium excerises.";
	System.out.println("String 1 is : " +str1);
	System.out.println("String 2 is : " + str2);
	
	String str3 = str1.concat(str2);
	
	System.out.println(str3);
}
}