package pattern;

import java.util.*;

public class pattern5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		
		for(int i=1 ; i<=n ; i++) {
			
			int p = i;
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print(p+" ");
			
					p+=1;
				
			}
			
			System.out.println();
		}
				
	}

}
