package JAVA;
import java.util.Scanner;

public class Day02Task2 {
	//Task2 - to find the vowels and consonants in the given sentence
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the string : ");
	String str = scanner.nextLine().toLowerCase();
	//initializing for vowels and consonats
	int vowels = 0;
	int consonants = 0;
	for(char c: str.toCharArray()){ 
	if(c>='a' && c<='z') { //to check if the character is a letter
	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {//to check if the character is a vowel 
	vowels++;
	}else{
	consonants++;
	} 
	}
	}
	System.out.println("Vowels: " +vowels);
	System.out.println("Consonants: " +consonants);
	scanner.close();
	}
	}

