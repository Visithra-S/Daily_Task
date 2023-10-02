import java.util.Scanner;

class ScannerExample{
	public static void main(String visi[]){
		Scanner scanner = new Scanner(System.in);//System.in-predefined object in inputstream
		
		System.out.println("What is your Name : ");
		String name = scanner.nextLine();
		
		System.out.println("What is your age : ");
		int age = scanner.nextInt();
		scanner.nextLine();//the reason when we use number data type after compulsory use nextline method because its didnt taken contineous input
		
		System.out.println("What is your mailId : ");
		String email = scanner.nextLine();
		
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My email id is : " + email);
		
	}
}
