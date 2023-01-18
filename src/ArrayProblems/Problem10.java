package ArrayProblems;

public class Problem10 {

	//find the min and the max value in the array
	
	public static void main(String [] args )
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
			else if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("The min value is : " + min + " and the max value is : " +max);
		
	}
}
