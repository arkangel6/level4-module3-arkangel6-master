package _02_gotta_catchem_all;

public class ExceptionMethods extends Exception {

	public double divide(double a, double b) throws IllegalArgumentException {

		double quotient = a / b;

		if (b == 0) {
			throw new IllegalArgumentException();
		}

		return quotient;

	}

	public String reverseString(String s) throws IllegalStateException {

		String newS = "";

		if (s.length() == 0) {
			throw new IllegalStateException();
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			newS += s.charAt(i);
		}

		return newS;
	}
}
