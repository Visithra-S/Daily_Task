import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num1 = sc.nextInt();
		
		if(num1%2 == 0){//(num1%3 == 0) -> its using for another way to finding odd number 
			System.out.println("even number");
		}else{
			System.out.println("odd number");
		}
	}
}
