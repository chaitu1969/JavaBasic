package functions;

import java.util.*;

public class Solution {
	
	 public static void seq(int A, int B, int N){
	        
	        int a = A; 
	        int b = B;
	        int n = N;
	        
	       
	            for(int j=0; j<n; j++){
	            	
	            	for(int l=0; l<=j; l++) {
	            		
	            		 int sol = 1;
	                	p*=2;
	                sol *= (a + p * b);
	                System.out.print(sol+" ");
	            	}
	                
	            }
	            System.out.println();
	    }
	    
	    
	    public static void main(String arg[]){
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        for(int i=0; i<t ; i++){
	            int a = s.nextInt();
	            int b = s.nextInt();
	            int n = s.nextInt();
	            seq(a, b, n);
	            System.out.println();
	        }
	        
	    }

}
