package Arrays;
import java.util.*; 
class EvenOddArr { 
	  
static void assign(int a[], int n) { 
      
    Arrays.sort(a); 
  
    int ans[] = new int[n]; 
    int p = 0, q = n - 1; 
    for (int i = 0; i < n; i++) { 
          
    if ((i + 1) % 2 == 0) 
        ans[i] = a[q--]; 
  
    else
        ans[i] = a[p++]; 
    } 
   
    for (int i = 0; i < n; i++) 
    System.out.print(ans[i] + " "); 
} 
  
public static void main(String args[]) { 
    int A[] = {1, 3, 2, 2, 5}; 
    int n = A.length; 
    assign(A, n); 
} 
} 