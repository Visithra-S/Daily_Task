import java.util.Scanner;

class MethodDemo{
	
	static String personelDetails(String firstName,String lastName){
		return firstName + " " +lastName;
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your FirstName : ");
		String firstname = scanner.nextLine();
		
		System.out.println("Enter your LastName : ");
		String lastname = scanner.nextLine();
		
		String fullName = personelDetails(firstname, lastname);
		
		System.out.println("My fullName is  " + fullName);	
	}
}
