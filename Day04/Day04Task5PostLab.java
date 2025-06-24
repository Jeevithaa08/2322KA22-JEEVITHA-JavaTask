package JAVA;
//Create a Java program that lets user perform CRUD (Create, Read, Delete) operations for employee records stored in a text file.
import java.io.*;
import java.util.Scanner;
public class Day04Task5PostLab {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String file = "emp.txt"; // File to store employee records

        while (true) {
            // Show menu to user
            System.out.print("1.Add 2.Show 3.Clear 4.Exit: ");
            int ch = sc.nextInt(); sc.nextLine(); // Read user choice

            if (ch == 1) {
                // Add a new employee record
                System.out.print("Enter employee data: ");
                String data = sc.nextLine();
                // Append the data to the file
                new FileWriter(file, true).append(data + "employees").close();
            } else if (ch == 2) {
                // Display all employee records
                File f = new File(file);
                if (f.exists()) {
                    Scanner read = new Scanner(f);
                    while (read.hasNextLine()) {
                        System.out.println(read.nextLine());
                    }
                    read.close();
                } else {
                    System.out.println("No records found.");
                }
            } else if (ch == 3) {
                // Delete (clear) all employee records
                new PrintWriter(file).close(); // Clears the file
                System.out.println("All records deleted.");
            } else {
                // Exit the program
                System.out.println("Exiting...");
                break;
            }
        }
    }
}