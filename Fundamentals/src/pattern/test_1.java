package pattern;
import java.util.*;
public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
	        
	        int N = s.nextInt();
	        
	        //int r = 2 * N + 1;
	        
	        // First Half
	        
	        for(int i=1; i<=N+1; i++) {
	            
	            int count = 1;
	            
	          
	                System.out.print("*");                
	            
	            for(int j=2; j<=i; j++){
	                
	                System.out.print(count);
	                count++;
	            }
	             for(int k=count ; k>=1; k--){
	                 
	                 if(k>2)
	                     System.out.print(k-2);
	                 else
	                     System.out.print("");
	             }
	            
	            if(i>1)
	                System.out.print("*");
	            
	        System.out.println();


	        }
	        
	        // Second Half
	        
	        for(int i=N; i>=0;i--){
	            
	            //if(i>0)
	                System.out.print("*");

	            int temp = 2*i-3;
	            
	            
	            
	            int cond  = (i+1)/2;
	            
	            
	            
	            for(int j=1;j<=i-1;j++){

	                System.out.print(j); 
	                
	                //unt++;

	            }
	            
	            for(int k=i-2; k>=1; k--) {
	                
	                System.out.print(k);

	            }
	            
	            if(i>1)
	                System.out.print("*");

	            
	            System.out.println();

	        }

	}

}
