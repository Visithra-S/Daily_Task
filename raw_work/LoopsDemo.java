class LoopsDemo{
	public static void main(String visi[]){
	
	int i=0;
		
	
	//for loops
		for(i=0 ; i <= 5 ; i++){
			for(int j = 0 ; j <= i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		int j=0;
		//while loop
		while(j<=5){
			System.out.println(j);
			j++;
		}
		System.out.println();
	
		int k=0;		
				
		//do while
		do{
			System.out.println(k);
			k++;
		}while(k<=5);
		
	}
}
