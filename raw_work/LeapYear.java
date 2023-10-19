import java.util.Scanner;

public class LeapYear{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println("Centuries Leap year.");
				}else{
					System.out.println("Centuries non Leap year.");
				}
			}
			System.out.println("Leap year.");
		}else{
			System.out.println("Non-Leap year.");
		} 
	}
}
