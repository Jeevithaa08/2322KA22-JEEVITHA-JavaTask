package JAVA;
import java.io.*;
//Task 2: Read from a text file and display the content
//Write a Java program to read content line by line from a text file and display it.


public class Day04Task2 {
 public static void main(String[] args) {
     try {
         BufferedReader br = new BufferedReader(new FileReader("src/JAVA/211sample.txt"));
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line); // Print each line
         }
         br.close();
     } catch (IOException e) {
         System.out.println("File not found!");
     }
 }
}
