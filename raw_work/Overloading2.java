class Overloading2{
	
	static void method1(){
		System.out.println("empy method");
	}
	static void method2(int a, int b){
		System.out.println("Its take two arguement method");
	}
	
	static void method3(int a,int b,int c){
		System.out.println("Its take three arguement method");
	}

	public static void main(String visi[]){
		method1();
		method2(1,2);
		method3(1,2,3);		
	}
}
