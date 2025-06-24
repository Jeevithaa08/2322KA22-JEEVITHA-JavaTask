package JAVA;

import java.util.Scanner;

//design a mini address book using array of strings

public class Day02Task5PostLab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] contacts = new String[5]; //array to store upto 5 contacts
		int count = 0; //counter to keep track of added contacts
		
		while(true) {
			//menu display
			System.out.println("Welcome to my Address book");
			System.out.println("1. add contact");
			System.out.println("2. view contact");
			System.out.println("3. Exit");
			System.out.println("Enter choice");
			
			int choice = scanner.nextInt();
			scanner.nextLine();			
			if(choice == 1) {
				if(count < contacts.length) {
					System.out.println("Enter name :");
					contacts[count] = scanner.nextLine(); //store name in array
					count++; //increase count
					System.out.println("Contact added");
					
					
				}else {
					System.out.println("Adress book is full"); //when array is full
				}
			}else if(choice == 2) {
				//view contacts
				System.out.println("Contacts :");
				for(int i =0;i<count;i++) {
					System.out.println((i + 1) + ". " + contacts[i]);
					
				}
			}else if(choice == 3) {
				System.out.println("bye");
				break; //exit loop
				
			}else {
				System.out.println("invalid choice"); //if user entets wrong userinput
			}
			
		}
		scanner.close();
	}
}
