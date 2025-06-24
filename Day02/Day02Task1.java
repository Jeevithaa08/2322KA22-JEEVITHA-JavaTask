package JAVA;
import java.util.Scanner;
public class Day02Task1 {
	//Taskı - to display the array elements in reversed order
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the array size: "); 
	int size = scanner.nextInt(); 
	int[] array = new int[size]; //to enter the array size
	System.out.println("Enter elements: ");
	for(int i=0;i<size;i++){
	array[i]=scanner.nextInt();
	}
	//to read each element and store it in array }
	System.out.println("Reversed array: "); 
	
	for(int i = size - 1 ;i >= 0;i--) { //loops through each element in reversed order
	    System.out.println(array[i] + " ");
	}
	scanner.close();
	}
}
