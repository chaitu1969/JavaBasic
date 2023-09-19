package pattern;

import java.util.*;

public class pattern12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N= s.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			for(int j=1; j<=N - i; j++) {
				
				System.out.print(" ");
			}
			
			int num = 1;
			
			for(int k=N-i+1; k<=N; k++) {
				
				System.out.print(num);
				
				num++;
			}
					
			for(int dec=i-1; dec>=1; dec--) {
			
				System.out.print(dec);			
				
			}
			
//			int dec = i-1;
//			
//			while(dec>=1) {
//				
//				System.out.print(dec);
//				
//				dec--;
//			}
			
			
//			for(int k=N; k<=N+N; k++) {
//				
//				int nxt=1;
//				
//				int temp = nxt;
//				
//				for(int l=N; l<=k; l++) {
//					
//					System.out.print(temp);
//					
//					temp--;
//				}
//				
//				System.out.print(" ");
//				
//				nxt = nxt + 1;
//				
//			//System.out.println();
//			}
			
			
		System.out.println();
		}
	}
}
