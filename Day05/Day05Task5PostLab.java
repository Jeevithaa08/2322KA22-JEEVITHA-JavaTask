package JAVA;
//Mini Student Management App (Small Version)
//➤ Add student with ID
//➤ Assign course
//➤ Display all data

import java.util.*;

public class Day05Task5PostLab {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     HashMap<Integer, String> studentNames = new HashMap<>();
     HashMap<Integer, String> courseMap = new HashMap<>();

     // Add 2 students with 1 course each
     for (int i = 0; i < 2; i++) {
         System.out.print("Enter Student ID: ");
         int id = sc.nextInt();
         sc.nextLine(); // clear buffer
         System.out.print("Enter Student Name: ");
         String name = sc.nextLine();
         System.out.print("Enter Course Name: ");
         String course = sc.nextLine();

         studentNames.put(id, name);
         courseMap.put(id, course);
     }

     // Display records
     System.out.println("Student Records:");
     for (int id : studentNames.keySet()) {
         System.out.println("ID: " + id + ", Name: " + studentNames.get(id) +
                            ", Course: " + courseMap.get(id));
     }
 }
}