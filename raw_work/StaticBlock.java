
public class StaticBlock {
	
	int a=10;
	
	static {
		System.out.println("Static block starts here");
	}
	
	{
		System.out.println("Non-Static Block method starts here");
	}
	
	StaticBlock(){
		System.out.println("Constructor starts here");
	}
	
	void Test(){
		System.out.println("Non-static method starts here");
	}
	
	static void Test1(){
		System.out.println("static method starts here");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method Starts here");//without main method we can't run because JVM starts main method
		
		StaticBlock sb = new StaticBlock();
		
		StaticBlock sb1 = new StaticBlock();
		
		sb.Test();
		
		Test1();
		
		System.out.println(sb.a);
	}

}
