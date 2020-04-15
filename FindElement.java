package Arrays;

public class FindElement {

	public static void main(String[] args) {
		int arr[]= {4,3,7,3,7,8};
		int key=7;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				System.out.println("element found    " + arr[i] + "   at position   " +  i);
		}
	}

}
