package JAVA;
import java.util.Scanner;
public class Day01Task4Maintask {
	//Task4 - to display the menu driven calculator using switch case and methods
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(true) {
	System.out.println("1. Add");
	System.out.println("2. Sub");
	System.out.println("3. Mul");
	System.out.println("4. Div");
	System.out.println("5. Exit");
	System.out.println("Choose an option : ");
	int option = scanner.nextInt();
	if(option == 5) {
	System.out.println("Exiting ");
	break;
	}
	System.out.println("Enter the number 1 : ");
	double num1 = scanner.nextDouble();
	System.out.println("Enter the number 2 : ");
	double num2 = scanner.nextDouble();
	
	
	switch(option) {
	case 1:
	System.out.println("Result " + (num1 + num2));
	break;
	case 2:
	System.out.println("Result " + (num1 - num2));
	break;
	case 3:
	System.out.println("Result " + (num1 * num2));
	break;
	case 4:
	if(num2 != 0){
	System.out.println("Result " + (num1 / num2));
	}else{
	System.out.println("Error"); 
	}
	break;
	default:
	System.out.println("Invalid option");
	
	}}
	scanner.close();
	}
}

