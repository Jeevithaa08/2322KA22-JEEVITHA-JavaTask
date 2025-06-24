package JAVA;
import java.util.Scanner;
public class Day01Task2 {
	//Task2 - to print the Simple interest
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

	//Simple interest formula =p * n * r / 100

	System.out.println("Enter amt :");

	double p = scanner.nextDouble();

	System.out.println("Enter no of year :");

	double n = scanner.nextDouble();

	System.out.println("Enter rate:");
	double r = scanner.nextDouble();


	if( p > 0 && n > 0 && r > 0) { //Condition giving

	double percent = (( p  * n * r)/100); //formula

	System.out.println("SI percentage:" + percent);
	scanner.close();
	}
}
}

