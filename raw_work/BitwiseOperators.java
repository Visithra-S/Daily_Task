class BitwiseOperators{

	public static void main(String visi[]){
	
		int a=10;
		
			System.out.println("& is : " + (a<12 & a<14));// when two conditions are true then returns true
			
			System.out.println("&& is : " + (a<14 && a<9));
			
			System.out.println("| is : " + (a<12 | a<9));//when one conditions true then return true.
		
			System.out.println("|| is : " + ((a<12) || (a<7)));
			
			System.out.println("! is : " + !(a<12 && a<14));//true->false,false->true

	}
}
