package Arrays;

public class reverse {
	static void fun(int arr[], int start , int end) {
		int temp;
		for(int i=0; i<(arr.length/2);i++)
		{
			temp=arr[i];
			arr[i]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void print(int arr[], int size) {
		for (int i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
          
        System.out.println(); 
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		reverse.fun(arr,0,4);
		reverse.print(arr,5);

	}

}
