class StringMemoryOccupation{
	public static void main(String args[]){
		
		String str = new String("This value Storing in Heap Memory");
		System.out.println("First Type of Object creation using new keyword : " + str);
		
		String str1 = "This value storing in string constant pool memory.it is the String Speciality";
		System.out.println("Second type of Object Creation using string literals : " + str1);
		
		String s2 = "This value creating a own object for that and also pointing this s2 reference";
		System.out.println(s2);
		
		s2 = "This value creating a another object for that also pointing this value only old object collected by gc";
		System.out.println(s2);//also two object storing in memory is same process
		
	} 
}
