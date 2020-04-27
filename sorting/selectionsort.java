package sorting;

public class selectionsort {
	
	static void sort(int arr[])
	{ 
		for(int i=0 ;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[j]<arr[index])
					index=j;
			
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arr[] = {64,25,12,22,11}; 
        sort(arr); 
        System.out.println("Sorted array"); 
        printArray(arr); 
    }

}
