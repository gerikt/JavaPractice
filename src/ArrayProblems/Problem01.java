package ArrayProblems;

public class Problem01 {

	public static void main(String[] args) {

		
		int [] arr= {1,2,3,4,5,6,7,8,9,0};
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>5)
			{
				System.out.println(" The value at index " + i + " is bigger than 5");
			}
		}
	}

}
