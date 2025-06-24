package JAVA;
//Create an ArrayList to store student names Use an Iterator to display the student names

import java.util.*;

public class Day05Task1 {
 public static void main(String[] args) {
     ArrayList<String> students = new ArrayList<>();
     students.add("Joyce");
     students.add("Rahul");
     students.add("Asha");
      // an iterator is used to loop through elements one by one
     // Using Iterator to display names
     Iterator<String> it = students.iterator(); //creates an iterator for students list
     System.out.println("List of Students:");
     while (it.hasNext())//checks if there is another element in the list {
         System.out.println(it.next());
     }
 }
}