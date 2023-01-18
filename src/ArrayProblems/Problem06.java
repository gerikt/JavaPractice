package ArrayProblems;

public class Problem06 {
//write a program that find the index of an array element
	
	public static void main (String [] args)
	{
		int element = 4;
		int [] arr = {10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println("The element is located at index : " +i);
			}
		}
		
		
		
		
	}
	
	}

