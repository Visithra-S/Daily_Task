package in.dev.practice;

public class BreakLoop {

	public static void main(String[] args) {
		for(int i = 0; i<3 ; i++) {
			for(int j = 0; j < 3; j++) {
				if(j ==1)break;//continue
				System.out.println("j = " + j);
			}
		}
		System.out.println("");
	}

}
