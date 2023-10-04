import java.util.Scanner;

class MethodDemo{
	
	static String personelDetails(String firstName,char lastName){
		return firstName + " " +lastName;
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your FirstName : ");
		String firstname = scanner.nextLine();
		
		System.out.println("Enter your LastName : ");
		char lastname = scanner.next().charAt(0);
		
		String fullName = personelDetails(firstname, lastname);
		
		System.out.println("My fullName is  " + fullName);	
	}
}
