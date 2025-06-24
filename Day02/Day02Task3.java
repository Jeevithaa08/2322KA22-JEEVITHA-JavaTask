package JAVA;
import java.util.Scanner;
public class Day02Task3 {
	//Task3 - to split the sentences into words
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String str = scanner.nextLine();
	String[] words = str.split(" "); //spliting the words
	System.out.println("words");
	for(String word: words){
	System.out.println(word);
	}
	scanner.close();
	}
	}

