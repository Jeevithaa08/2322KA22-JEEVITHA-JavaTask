package JAVA;

import java.util.Scanner;

//Write a program to accept student marks and print results using the grading logic and functions

public class Day01Task5PostLab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks = scanner.nextInt();
		String grade = calculatGrade(marks);
		System.out.println("Grade : " + grade);
		}
	public static String calculatGrade(int marks) {
		if(marks >= 90) return "A+";
		else if(marks >= 80) return "A";
		else if(marks >= 70) return "B";
		else if(marks >= 60) return "C";
		else if(marks >= 50) return "D";
		else return "F";
		
		
	}
	

}
