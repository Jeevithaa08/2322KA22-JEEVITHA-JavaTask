package JAVA;

//Task 2: Use a HashSet to store a list of unique email addresses Store email addresses and avoid duplicates using HashSet
import java.util.*;

public class Day05Task2 {
 public static void main(String[] args) {
	 //hashset is a collection that stores unique values and avoid duplicates
     HashSet<String> emails = new HashSet<>();

     // Adding email addresses
     emails.add("jee@gmail.com");
     emails.add("anu@gmail.com");
     emails.add("jee@gmail.com"); // duplicate, won't be added

     // Display emails
     System.out.println("Unique Email Addresses:");
     for (String email : emails) // String email-each item in a set is string {
         System.out.println(email);
     }
 }

