public class OddArray{
	public static void main(String visi[]){
	
		 int[] number = {10, 44, 555, 999, 5, 6, 77, 50, 633, 80, 40, 550, 440, 444, 603, 708, 503, 555,  03, 05, 80, 702, 201, 308, 397};
		 
		 try{
		  	for(int i = 0; i < number.length; i++){
		 		if(number[i]%2 == 0){
		 			System.out.println(number[i] +" Even number.\n");
		 		}else{
		 			System.out.println(number[i] +" Odd Number.\n");
		 		}
		 	}
		 }catch(ArrayIndexOutOfBoundsException e){
		 	System.out.println("ArrayINdexOutOfBoundsException.");
		 }
	}
}
