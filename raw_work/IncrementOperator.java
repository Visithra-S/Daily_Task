package in.dev.practice;

public class IncrementOperator {

	public static void main(String[] args) {
		
		int a = 1;
		int c = 5;
		int e = 2;
		int f = 3;
		int b = a++;
		int d = ++c;
		
		int g = e++ + f++;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("c = " + c + ", d = " + d);
		System.out.println("e = " + e + ", f = " + f + ", g = " + g );
	}

}
