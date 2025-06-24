package JAVA;
import java.io.*;
//Read a file with student names and 3 marks each, calculate total,
//and write the result to a new file.
public class Day04Task4MainTask {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("result"));

            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                int total = Integer.parseInt(s[1]) + Integer.parseInt(s[2]) + Integer.parseInt(s[3]);
                bw.write(s[0] + " - Total: " + total);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("Done writing to result.txt");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}