package JAVA;
import java.util.Scanner;
public class Day02Task4MainTask {
	//Task4 - to give char count, spliting of words, words count and reversed version
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str = scanner.nextLine();
	//words count
	String[] words = str.split(" ");
	int wordCount = words.length;
	System.out.println("The words count:" + wordCount);
	//character count
	int charCount = str.length();
	System.out.println("Character count: " + charCount);
	//Reversed String
	StringBuilder reversedStr = new StringBuilder(str).reverse();
	System.out.println("Reversed String: " + reversedStr);
	//longest word
	String longestWord = "";
	for(String word: words){
	if(word.length() > longestWord.length()){
	longestWord = word;
	} }
	System.out.println("Longest word: " + longestWord);
	scanner.close();
	}
}
