package in.dev.practice;

public class Sum1 {

	public static void main(String[] args) {
		double  nums[] = {5,10,15};
		double sum = 0;
		int i;
		for(i = 0; i < 3 ; i++) {
			sum = sum + nums[i];
		}
		System.out.println("sum is " + sum);
	}
}
