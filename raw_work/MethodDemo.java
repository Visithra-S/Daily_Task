import java.util.Scanner;

class MethodDemo{
	
	static String personelDetails(String firstName,char lastName){
		return firstName + "" +lastName;
	}
	public static void main(String args[]){
		
		String name[] = new String[1];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your FirstName : ");
		String firstname = scanner.nextLine();
		System.out.println("Enter your LastName : ");
		char lastname = scanner.next().charAt(0);
		String fullName = personelDetails(firstname, lastname);
		//personelDetails("Visithra" , "S");
		System.out.println("My fullName is  " + fullName);
	}
}
