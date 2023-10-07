class MethodDemo1{
	int num1;
	int num2;
	
	
	void demo(int a, int b){
		num1=a;
		num2=b;
	}
	
	int value(){
		return num1*num2;
	}
}
public class MethodDemo2{
	public static void main(String visi[]){
		
		MethodDemo1 methoddemo = new MethodDemo1();
		
		methoddemo.demo(1,2);
		System.out.println(methoddemo.value());		
	}
}
