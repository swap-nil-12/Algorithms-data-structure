package Arrays;

public class SumPair {
	static void sumfun(int arr[], int pair)
	{
		int j,temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			for( j=i;j<arr.length;j++)
				{
				
				if (arr[i]+arr[j]==pair) {
					System.out.println("found");
				    temp=arr[i]+arr[j];
				}
				}
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {28,32,56,64,23};
		int pair=87;
		SumPair.sumfun(arr,pair);

	}

}
