package javarevisited;

public class duplicate {
	public static void main(String []args)
	{
		int[] arr={0, 3, 1, 2, 3};
		for(int i = 0; i < arr.length; i++) 
		{  
	            for(int j = i + 1; j < arr.length; j++) 
	            {  
	                if(arr[i] == arr[j])  
	                    System.out.println("duplicate   " +   arr[j]);  
	            }  
	    } 
		
	}

}
