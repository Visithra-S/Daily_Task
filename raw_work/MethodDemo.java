import java.util.Scanner;

class MethodDemo{
	
	private static String personelDetails(String firstName,String lastName){
	
		if(firstName.length() == 0 && lastName.length() == 0){
		   return "Does`t Provide the First Name and Last Name.";
		}
		
		if(firstName.equalsIgnoreCase("null") && lastName.equalsIgnoreCase("null")){
		   return "firstname and lastName shouldn't null .";
		}
		
		 return firstName + " " +lastName;
	}
	
	public static void main(String args[]){

		String firstname = null, lastname = null;	
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your FirstName : ");
		firstname = scanner.nextLine();
		
		System.out.println("Enter your LastName : ");
		lastname = scanner.nextLine();
		
		String fullName = personelDetails(firstname, lastname);
		
		System.out.println("My fullName is : " + fullName);	
	}
}
