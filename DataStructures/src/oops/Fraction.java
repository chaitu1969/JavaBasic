package oops;

public class Fraction {
	
	public static int sum(int f1 , int f2) {
		return f1+f2;
	}
	
	public static void main(String[] args) {
		
		fractionop f1 = new fractionop(5,10);
		//f1.print();
		int f = f1.print();
		fractionop f2 = new fractionop(2,3);
		//f2.print();
		int f3 = f2.print();
		System.out.println(sum(f,f3));
	}

}
