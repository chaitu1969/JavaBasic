package oops;

public class fractionop {
	
	int numerator;
	int denominator;
	
	
	public fractionop(int numerator, int denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
		simple();
		
	}
	
	public void simple() {
		int div = 1;
		int small = Math.min(numerator, denominator);
		for(int i=2; i<=small; i++) {
			if(numerator % i==0 && denominator % i== 0) {
				div = i;
			}
		}
		
		numerator = numerator / div;
		denominator = denominator / div;
	}
	
	public int print() {
		return numerator/denominator;
		//System.out.println(numerator + "/" +denominator);
	}
	
	

}
