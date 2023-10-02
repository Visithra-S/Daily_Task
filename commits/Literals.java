public class Literals{
	public static void main(String visi[]){
		int age = 22;//integer type
		boolean isAge = true;//boolean type
		char lastname = 'S';//character type
		int age1 = 0x10;//octal type
		int age2 = 0XA;//hexa decimal
		long lng = 7L;//7l long type
		int n = 0b0101011101;//JDK 7.0  binary value
		int n1 = 123_456_789;//using replacing , _ larger vaue
		//float pi = 3.14159e;
		
		System.out.println("age " + age);
		System.out.println("isAge " + isAge);
		System.out.println("lastname " + lastname);
		System.out.println("age1 " + age1);
		System.out.println("age2 " + age2);
		System.out.println("lng " + lng);
		System.out.println("n " + n);
		System.out.println("n1 " + n1);
		//System.out.println("pi" + pi);
		
		//type casting
		
		byte b = 5;//byte value
		int nu =b;//automatic type conversion byte to int
		int n2 =10;
		byte n3 = (byte)n2;
		
		System.out.println("b " + b);
		System.out.println("nu " + nu);
		System.out.println("n2 " + n2);
		System.out.println("n3 " + n3);		
	}
}
