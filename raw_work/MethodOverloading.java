import java.lang.*;

class MethodOverloading{
	
	static int max(int a,int b){
		return a<b?a:b;
	}
	
	static double max(double a,double b){
		return a<b?a:b;
	}
	
	static char max(char a, char b){
		return a<b?a:b;
	}

	public static void main(String visi[]){
		System.out.println(max(1,2));
		System.out.println(max(1.2,2.3));
		System.out.println(max('s','v'));
		System.out.println(Math.abs(-1.2));
		System.out.println(Math.abs(12));
	}
}
