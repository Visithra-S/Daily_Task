class IncDecOperators{
	public static void main(String visi[]){
		int a=10,b=5;
			
		int a1 = a++;//firstly assign the and increasing the value and showing only assigning value.-post increment
		int a2 = ++a;//incase  aldready icremented value it take that and firstly shows the incremented value -pre increment
		
		int b1 = b--;//same as-post decrement
		int b2 = --b;//pre decrement
		
		//Increment
		System.out.println(a1);
		System.out.println(a2);
		//DEcrement
		System.out.println(b1);
		System.out.println(b2);
	}
}
