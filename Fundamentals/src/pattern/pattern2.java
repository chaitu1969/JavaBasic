
package pattern;

import java.util.*;

public class pattern2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=1 ; j<=n ; j++) {
				
				System.out.print("("+i +" "+j+")");
			}
			
			System.out.println();
		}
				
	}

}
