package JAVA;
//Student Course Enrollment System (Simple Version)
//Add students and assign one course and Display enrollments using ArrayList & HashMap

import java.util.*;

public class Day05Task4MainTask {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ArrayList<String> students = new ArrayList<>();
     HashMap<String, String> courseMap = new HashMap<>();

     // Add 2 students
     for (int i = 0; i < 3; i++) {
         System.out.print("Enter student name: ");
         String name = sc.nextLine();
         students.add(name);

         System.out.print("Enter course name: ");
         String course = sc.nextLine();
         courseMap.put(name, course);
     }

     // Display student → course
     System.out.println("Student Enrollments:");
     for (String s : students) {
         System.out.println(s + " has taken " + courseMap.get(s));
     }
 }
}