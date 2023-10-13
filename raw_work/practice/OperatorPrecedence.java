package in.dev.practice;

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		int a = 1 + 2 * 6/3;
		int c = ( 1 + 2) * 6/3;
		System.out.println("a = " + a + ", c = " + c);
	}

}
