package in.dev.practice;

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Precise1 extends Precise{
	public static void main (String[] args) {
		

		Precise g = new Precise();
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter integer value : ");
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		System.out.println("Enter the first float value : ");
		float a = sc.nextFloat();
		
		System.out.println("Enter the second float value : ");
		float b = sc.nextFloat();
		
		Precise.printInFormat(a, b);
		System.out.println();
		
		}
		
	}
}