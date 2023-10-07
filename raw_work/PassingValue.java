class PassingValue{
	
	static void increment(int a){
			 a++;
		}

	public static void main(String args[]){
		int a = 10;
		increment(a);//this is called call by value because we passing the value in the method.
		increment(a);
		System.out.println(a);
		System.out.println(a);		
	}
}
