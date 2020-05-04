package javarevisited;

public class nonduplicate {
	
	    static int findSingle(int ar[]) 
	    { 
	        int res = ar[0]; 
	        for (int i = 1; i < ar.length; i++) 
	            res = res ^ ar[i]; 
	      
	        return res; 
	    } 
	  
	    public static void main (String[] args) 
	    { 
	        int ar[] = {2, 3, 5, 4, 5, 3, 4};
	        System.out.println("Element occurring once is " + 
	                            findSingle(ar) + " "); 
	    } 
	} 

