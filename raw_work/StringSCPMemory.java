class StringSCPMemory{

	public static void main(String args[]){
	
	//when we create a object using string literal this automatically taken a memory space in string constant pool memory if some values are same that time scp memory cannot create a new memory object its takes a aldready existing value and refers it
		String s1 = "Visithra S";
		String s2 = "Visithra S";
		String s3 = "Visithra S";
		String s4 = "Visithra S";
		String s5 = "Visithra S";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
	}
}
