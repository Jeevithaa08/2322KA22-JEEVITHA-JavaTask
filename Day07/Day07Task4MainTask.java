package Day07;

import java.sql.*;
import java.util.Scanner;

public class Day07Task4MainTask {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root"; // change this

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Marks: ");
                int marks = sc.nextInt();

                PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, marks);
                ps.executeUpdate();
                System.out.println("✅ Student added.");
            } 
            else if (ch == 2) {
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student");
                while (rs.next())
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            } 
            else {
                System.out.println("👋 Exiting...");
                break;
            }
        }

        con.close();
        sc.close();
    }
}