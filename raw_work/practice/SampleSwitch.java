package in.dev.practice;

public class SampleSwitch {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++ ) {
			switch(i) {
			case 0:
				System.out.println("i is zero.");
				break;
			case 1:
				System.out.println("i is one");
				break;
			default:
				System.out.println("i is greater than 1.");
			}
		}
	}
}
