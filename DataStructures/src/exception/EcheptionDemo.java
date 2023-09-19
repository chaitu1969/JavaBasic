package exception;

public class EcheptionDemo {
	
	
	public static int divs(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException();
		}
		
		return a/b;
	}
	
	public static void main(String[] args) {
		
		divs(10,0);
		
	}

}
