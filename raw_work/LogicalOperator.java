package in.dev.practice;

public class LogicalOperator {

	public static void main(String[] args) {
		 
 		int a = 1;
		int b = 2;
		System.out.println("a = " + a + ", b = " + b);
		
		if(a++ > b++ & a++ < b++) {
			System.out.println("a1 = " + a + ", b1 = " + b);
		}
		
		System.out.println("a11 = " + a + ", b11 = " + b);
		
		a = 1;
		b = 2;
		if(a++ > b++ && a++ < b++) {
			System.out.println("a2 = " + a + ", b2 = " + b);
		}
		System.out.println("a21 = " + a + ", b21 = " + b);
		
		a = 1;
		b = 2;
		if(a++ < b++ | a++ > b++) 
			System.out.println("a3 = " + a + ", b3 = " + b);
			
		a = 1;
		b = 2;
		if(a++ < b++ || a++ > b++)
			System.out.println("a4 = " + a + ", b4 = " + b);

}
}
