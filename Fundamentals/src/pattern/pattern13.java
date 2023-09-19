package pattern;
import java.util.*;
public class pattern13 {
		public static void main(String[] args) {
			
			  Scanner s = new Scanner(System.in);
		        
		        int N = s.nextInt();
		        
		        for(int i=1; i<=N; i++) {
		            
		            for(int j=1; j<=N-i; j++) {
		                
		                System.out.print(" ");
		                
		                 int m = i-1;
		            while(m>=1){
		                System.out.print("*");
		                m++;
		            }
		            }
		            
		            for(int k=N-i+1; k<=N; k++) {
		                
		                System.out.print("*");

		            }
		            
		           System.out.println();
		            // int m = i-1;
		            // while(m>=1){
		            //     System.out.print("*");
		            //     m++;
		            // }
		}
		}}
