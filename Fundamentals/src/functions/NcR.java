package functions;

import java.util.Scanner;

public class NcR {
	
	public static int Ncr(int N, int R) {
		
		int t1=1;
		int t2=1;
		int t3=1;
		
		for(int i=1; i<=N; i++) {
			if(i<=N)
				t1*=i;
			if(i<=R)
				t2*=i;
			if(i<=N-R)
				t3*=i;
			
		}
		return t1/(t2*t3);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		//int sol = Ncr(n, r);
		//int sol = (int)Ncr(n,r);
		System.out.println(Ncr(n));
		
	}

}
