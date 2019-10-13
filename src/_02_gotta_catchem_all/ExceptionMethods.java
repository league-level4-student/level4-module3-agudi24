package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a,  double b) throws IllegalArgumentException {
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		return (a/b);
	}
	public static String reverseString(String a) throws IllegalStateException {
		if(a.equalsIgnoreCase("")) {
			throw new IllegalStateException();
		}

		return new StringBuilder(a).reverse().toString();
		
	}
}
