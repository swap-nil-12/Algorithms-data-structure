package javarevisited;

class missing
{
	public static void main(String []args)
	{
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};
		int i,j,c;
		for(i=1;i<a.length;i++)
		{

			if((a[i]-a[i-1])!=1)
			{
				c=a[i]-1;
				System.out.println(" Missing element is : "+c);

			}


		}
	}
}