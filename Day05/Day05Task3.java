package JAVA;

import java.util.*;

public class Day05Task3 {
    public static void main(String[] args) {
        // Create HashMap to store student name and total marks
    	//haspmap is a collection that stores a key-value pairs
    	//key-unique name or ID, value-related data
        HashMap<String, Integer[]> marks = new HashMap<>();

        // Add students and their marks (3 subjects)
        marks.put("Ravi", new Integer[]{85, 90, 88});
        marks.put("Rahul", new Integer[]{70, 75, 80});

        // Loop through each student to calculate average
        for (String name : marks.keySet()) {
            Integer[] m = marks.get(name);
            int total = m[0] + m[1] + m[2];
            double avg = total / 3.0;
            System.out.println(name + " Average: " + avg);
        }
    }
}