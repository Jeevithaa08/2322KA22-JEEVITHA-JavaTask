package JAVA;
//person - employee class with salary calculation
//parent class
class Person{
	String name = "Krishna";
}

//child class
class Day03Task2 extends Person {
	double salary = 100000;
		double bonus = 2000;
	
	void calculateSalary() {
		double total = salary+bonus;
		System.out.println("name :" + name);
		System.out.println("total salary : $" + total);
	}
	
	public static void main(String[] args) {
		Day03Task2 emp = new Day03Task2();
		emp.calculateSalary();
		
	}
}
