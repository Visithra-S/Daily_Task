class VarArgs{
	
	static int minValue(int... vals){
		int min = Integer.MAX_VALUE;
		for(int k : vals){
			if(k<min)
			min=k;
		}
		return min;
	}
	
	static double minValue(double... vals){
		double min = Double.MAX_VALUE;
		for(double k : vals){
			if(k<min)
			min=k;
		}
		return min;
	}
	
	
	public static void main(String visi[]){
		int m = minValue(13532,43243,3435435);
		System.out.println("First min value is : " + m);
		
		double n = minValue(32432.42432,343242.324);
		System.out.println("Second minimum value is : " + n);
	}
}
