package in.dev.practice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month in number : ");
		int month = sc.nextInt();
		
		String season;
		
		if(month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if(month == 3 || month == 4 || month ==5)
			season = "Spring";
		else if(month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if(month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = "Bogus month";
		System.out.println("April is in the " + season + ".");
		
		sc.close();
	}

}
