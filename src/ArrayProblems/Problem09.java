package ArrayProblems;

import java.util.Arrays;

public class Problem09 {

	//write a program tha inserts an element in a specific array position
	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9};
		int indexPos=3;
		int val =1000;
		
		for(int i=arr.length-1;i>indexPos;i--)
		{
			arr[i]=arr[i-1];
			
		}
		arr[indexPos]=val;
		
		System.out.println("The new array is : " + Arrays.toString(arr));
		
		
	}

}
