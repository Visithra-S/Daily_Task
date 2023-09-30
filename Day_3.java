import java.util.Arrays;

class Day_3{

	public static void main(String[] gmsk){
		
		final String separator = ","; 
		Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));
		
		Arrays.asList("v", "i", "s", "i").forEach((String e) -> System.out.println(e + separator));

		// The return statement is not required if the lambda body is just a one-liner.

//		int output = Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
//				int result = e1.compareTo( e2 );
//				return result;
//			} );

//		System.out.println("output = "+output);

	}
}
