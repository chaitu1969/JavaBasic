
package functions;

import java.util.*;

public class ncrr {
	
	public static int fct(int n) {
		
			int tmp = 1;
			
			for(int i=1; i<=n; i++)
				tmp*=i;
				
		return tmp;
		
	}
	
	public static int nc(int n, int r) {
		
		
		return ((fct(n)/(fct(n-r))/fct(r)));
		
	}
	public static int pro(int n, int x) {
		
		int ans = nc(4,x)* nc(4,n-x);
		
		float  prob =ans*1.0f/nc(8,n);
		
		return (int) (prob*100);
	}
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int r = s.nextInt();
		
		
		System.out.println(ncrr.pro(n,r));
		
	}

}
