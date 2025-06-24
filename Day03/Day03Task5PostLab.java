package JAVA;
import java.util.*;
//create a libraray system, add, remove aand issue books
class Library {
 ArrayList<String> books = new ArrayList<>();

 // Add a book
 void addBook(String book) {
     books.add(book);
     System.out.println(book + " added.");
 }

 // Remove a book
 void removeBook(String book) {
     books.remove(book);
     System.out.println(book + " removed.");
 }

 // Issue a book
 void issueBook(String book) {
     if (books.contains(book)) {
         books.remove(book);
         System.out.println(book + " issued.");
     } else {
         System.out.println(book + " not available.");
     }
 }

 // Show available books
 void showBooks() {
     System.out.println("Books in library: " + books);
 }
}

public class Day03Task5PostLab {
 public static void main(String[] args) {
     Library lib = new Library();
     lib.addBook("Java");
     lib.addBook("Python");
     lib.showBooks();

     lib.issueBook("Java");
     lib.showBooks();

     lib.removeBook("Python");
     lib.showBooks();
 }
}

