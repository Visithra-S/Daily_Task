package in.dev.practice;

public class DataTypeDiff {

	public static void main(String[] args) {
		byte a=10;
		int b;
		b=a;
		
		System.out.println(b);
		
		int a1=20;
		byte b1;
		b1=(byte)a1;
		
		System.out.println(b1);
		
		byte a2= 1;
		byte b2= 2;
		int c = a2 + b2;
		
		System.out.println(c);
	}
}
