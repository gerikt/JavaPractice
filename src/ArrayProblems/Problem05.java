package ArrayProblems;

public class Problem05 {
	
	//Check if an array contains a specific value

	public static void main(String [] args)
	{
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int el = 5 ;
		
		for (int i =0; i<arr.length;i++)
		{
			if(arr[i]==el)
			{
				System.out.println("the element with value : " + el + " is at position with index :" + i);
			}
		}
		
	}
	
}
