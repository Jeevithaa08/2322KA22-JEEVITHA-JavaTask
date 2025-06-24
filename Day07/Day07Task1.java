package Day07;
//Task 1: Connect to MySQL DB
import java.sql.*;

public class Day07Task1 {
 public static void main(String[] args) {
     // Replace with your details
     String url = "jdbc:mysql://localhost:3306/student"; 
     String user = "root"; 
     String password = "root"; 

     try {
         Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
         Connection con = DriverManager.getConnection(url, user, password); // Connect
         System.out.println("Connection Successful!");
         con.close();
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}