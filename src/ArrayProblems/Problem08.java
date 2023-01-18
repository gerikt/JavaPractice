package ArrayProblems;

import java.util.Arrays;

public class Problem08 {

	//create a program that copies an array by iterating it 
	
	public static void main(String [] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] arr2 = new int [9];
		
		System.out.println("Source array : " +Arrays.toString(arr));
		
		for (int i =0 ; i<arr.length-1 ; i++)
		{
			arr2[i]=arr[i];
		}
		
		System.out.println("New array is : " + Arrays.toString(arr2));
	}
}
