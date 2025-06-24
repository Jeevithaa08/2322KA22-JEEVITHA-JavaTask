package JAVA;
//Student management system(create student, assign marks, display result)
	class Student {
	    String name; //variable to store
	    int marks;   //variable to store
        // Constructor
	    Student(String name) {
	        this.name = name;   //refers to the variable inside the class 
	        }
	    // methods to assign marks to the student
	    void assignMarks(int m) {
	        marks = m;
	        }
	    // Display result
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }
	    }
	public class Day03Task4MainTask {
	    public static void main(String[] args) {
	        Student s1 = new Student("Sheela");
	        s1.assignMarks(85);
	        s1.display();
	    }
	}
	
