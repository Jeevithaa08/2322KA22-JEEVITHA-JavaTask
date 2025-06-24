package JAVA;

//Task 3: Write strings to a file line by line
//Write a Java program to write multiple lines of text into a file.

import java.io.*;

public class Day04Task3 {
 public static void main(String[] args) {
     try {
         BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
         bw.write("Hello, Jeevitha!");
         bw.newLine();
         bw.write("This is Day 4 - Task 3.");
         bw.newLine();
         bw.write("Writing text line by line.");
         bw.close();
         System.out.println("Data written to output.txt successfully.");
     } catch (IOException e) {
         System.out.println("Error writing to file.");
     }
 }
}