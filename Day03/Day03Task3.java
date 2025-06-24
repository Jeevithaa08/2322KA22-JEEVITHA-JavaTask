package JAVA;
//demonstrate overloading (sum(int, int) and sum(double, double))
public class Day03Task3 {
	    // sum for integers
	    static int sum(int a, int b) {
	        return a + b;
	    }

	    // sum for doubles
	    static double sum(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        System.out.println("Sum (int): " + sum(5, 10));
	        System.out.println("Sum (double): " + sum(5.5, 10.2));
	    }
	}
