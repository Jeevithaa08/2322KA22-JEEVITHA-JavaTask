package JAVA;
//Task 1: Handle divide-by-zero exception
//Write a Java program to handle ArithmeticException
//caused by division by zero.

public class Day04Task1 {
 public static void main(String[] args) {
     try {
         int a = 10, b = 0;
         int result = a / b;
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero!");
     }
 }
}

