import java.util.Scanner;

class UserArray{
	public static void main(String visi[]){
		
		int num[] = new int[5];
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a any five number : ");
		for(int i = 0 ; i < num.length ; i++ ){
			num[i] = scanner.nextInt();
		}
		System.out.println();
		
		for(int i = 0 ; i < num.length ; i++){
			
			sum += num[i];
			
			System.out.println(sum);
		}
	}
}
