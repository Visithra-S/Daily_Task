//arithmetic operator
class Operators{
	public static void main(String visi[]){
		int a=10,b=20,c,d,e,f;
		c = a + b;//variable name  = operand operator operand;
		System.out.println("Addition operator(+) : " + (c = a + b));
		
		d = a - b;
		System.out.println("Subtraction operator(-) : " + (d = a - b));
		
		e = a * b;
		System.out.println("Multiplication operator(*) : " + (e = a * b));
		
		f = a % b;
		System.out.println("Division operator(%) : " + (f = a % b));
		
		//compund assignment
		
		int x=10;
		//x = x+10;
		x+=10;//this is the compound assignment
		System.out.println(x);
	}
}
