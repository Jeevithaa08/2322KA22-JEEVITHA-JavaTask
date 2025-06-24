package Day07;

//Task 3: Display all student records using JDBC
import java.sql.*;

public class Day07Task3 {
 public static void main(String[] args) {
     String url = "jdbc:mysql://localhost:3306/student"; // DB name
     String user = "root"; // MySQL username
     String password = "root"; // Replace with your password

     try {
         // Load the MySQL JDBC Driver
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Establish connection
         Connection con = DriverManager.getConnection(url, user, password);

         // Create SQL query
         String query = "SELECT * FROM student";
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(query); // Execute query

         // Display data
         System.out.println("ID\tName\t\tMarks");
         System.out.println("---------------------------------");

         while (rs.next()) {
             int id = rs.getInt("id");
             String name = rs.getString("name");
             int marks = rs.getInt("marks");

             System.out.println(id + "\t" + name + "\t\t" + marks);
         }

         con.close();
     } catch (Exception e) {
         System.out.println(" Error: " + e.getMessage());
     }
 }
}