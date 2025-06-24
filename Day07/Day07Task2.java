package Day07;

import java.sql.*;

public class Day07Task2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // Insert multiple students
            stmt.executeUpdate("INSERT INTO student VALUES (3, 'Aishu', 89)");
            stmt.executeUpdate("INSERT INTO student VALUES (4, 'Nikki', 92)");

            System.out.println("✅ Multiple students inserted successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}