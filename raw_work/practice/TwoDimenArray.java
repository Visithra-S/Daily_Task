package in.dev.practice;

public class TwoDimenArray {

	public static void main(String[] visi) {
		int arr[][] = new int[2][5];
		int i,j,k = 0;
		
		for(i = 0 ; i < 2 ; i++ ) {
			for(j = 0 ; j <5 ; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		for(i = 0 ; i < 2 ; i++) {
			for(j = 0 ; j < 5 ; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
