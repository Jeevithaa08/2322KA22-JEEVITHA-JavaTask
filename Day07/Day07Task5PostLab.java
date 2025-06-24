package Day07;

import java.sql.*;
import java.util.Scanner;

public class Day07Task5PostLab {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/inventorydb", "root", "root");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add  2. View  3. Search  4. Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Price: "); double price = sc.nextDouble();
                System.out.print("Qty: "); int qty = sc.nextInt();

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO product VALUES (?, ?, ?, ?)");
                ps.setInt(1, id); ps.setString(2, name);
                ps.setDouble(3, price); ps.setInt(4, qty);
                ps.executeUpdate();
                System.out.println("✅ Added!");
            }
            else if (ch == 2) {
                ResultSet rs = con.createStatement().executeQuery("SELECT * FROM product");
                while (rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
            }
            else if (ch == 3) {
                System.out.print("Search Name: ");
                String name = sc.next();
                PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM product WHERE name=?");
                ps.setString(1, name);
                ResultSet r = ps.executeQuery();
                if (r.next())
                    System.out.println("ID: "+r.getInt(1)+" Price: "+r.getDouble(3)+" Qty: "+r.getInt(4));
                else
                    System.out.println("❌ Not found");
            }
            else break;
        }
        con.close(); sc.close();
    }
}