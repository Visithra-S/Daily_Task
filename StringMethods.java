class StringMethods{
	public static void main(String args[]){
	
		//length()
		String greeting = "I am your gift";
		System.out.println("greeting length is : "+ greeting.length());
		
		//toUppercase(),toLowerCase()
		String name = "Visithra S";
		System.out.println("My name in UpperCase : " + name.toUpperCase());
		System.out.println("My name in LOweCase : " + name.toLowerCase());
		
		//indexOf()
		String sentense = "i love the world! world like me ";
		System.out.println(sentense.indexOf("love"));
		
		//concatenation for string are concated using +,concat
		String firstName = "Visithra";
		String lastName = "Subramanian";
		System.out.println("My Name is - " + firstName + " " + lastName);
		System.out.println("MY name is : " + firstName.concat(lastName));
		
		//+ operator using adding two numbers
		int x = 10;
		int y = 20;
		int z = x + y ;
		System.out.println("value is = " + z);
		
		//there is working priority going to string so concat worked
		String myName = "Visithra";
		int age = 22;
		System.out.println("My name is " + myName + " My age is " + age); 
		
		//\"\" using double quotes inside letter
		String txt = "i am \"visithra\" my age is \"23\"";
		System.out.println(txt);
		
		String txt1 = "I\' Am Visithra";
		System.out.println(txt1);
		
		String txt2 = "The character \\ is called backslash.";
		System.out.println(txt2);
		
		String txt3 = "Hello\nWorld";
		System.out.println(txt3);
		
		String txt4 = "how hii uu do\ri know";
		System.out.println(txt4);
		
		String txt5 = "i \t can't";
		System.out.println(txt5);
		
		String txt6 = "i am software \b developer";
		System.out.println(txt6);
		
		String txt7 = "I working in \f ZOHO";
		System.out.println(txt7);		
	}
}
