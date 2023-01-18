package ArrayProblems;

public class Problem06DifferentSolution {

	//find the index of a specific element 
	
	public static int find(int [] arr,int val)
	{
		if(arr==null)
		{
			return -1 ;
			
		}
		
		int len = arr.length;
		int i =0;
		
	
		while(i<len)
		{
			if(arr[i]==val)
			{
				return i;
			}
			else i=i+1;
		}
		
		
		return -1;
	}
	public static void main(String[] args) {

		int [] arr = {25,14,56,15,36,77,18,29,49};
		System.out.println("Index position of 25 is : " + find(arr,25));
		System.out.println("Index position of 77 is : " + find(arr,77));

	}

}
