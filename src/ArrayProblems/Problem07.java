package ArrayProblems;

import java.util.Arrays;

public class Problem07 {

	//remove an element from an array
	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println("The original array is : " + Arrays.toString(arr));
		
		
		int removalIndex =2;
		
		for(int i = removalIndex; i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		System.out.println("The array after the removal is : "+Arrays.toString(arr));
	}

}
