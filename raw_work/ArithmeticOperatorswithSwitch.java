import java.util.Scanner;

class ArithmeticOperatorswithSwitch{
	
	public static void main(String visi[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first integer number : ");
		int a = sc.nextInt();
		System.out.println("Enter a second integer number : ");
		int b = sc.nextInt();
		System.out.println("Enter which operator will use '+,-,*,/,%'");
		char operator = sc.next().charAt(0);
		
		switch(operator){
			case '+':
				System.out.println("a + b = "+(a + b));
				break;
			case '-':
				System.out.println("a - b = "+(a - b));
				break;
			case '*':
				System.out.println("a * b = "+(a * b));
				break;
			case '/':
				System.out.println("a / b = "+(a / b));
				break;
			case '%':
				System.out.println("a % b = "+(a % b));
				break;
			default:
			System.out.println("Invalid operator");
		}
	}
}
