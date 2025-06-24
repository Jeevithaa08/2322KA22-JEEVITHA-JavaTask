package JAVA;

public class Day01Task3 {

	//Task3-to check whether the given year is leap year or not
	//method to check leapyear
	public static boolean isLeapYear(int year){
	if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //condition = 4 and 400/ by the year and 100 cannot be / by the year 
	return true;
	}
	else{
	return false;
	}
	}
	
	public static void main(String[] args){
	int year = 2017; //giving year as input
	if(isLeapYear(year)){
	System.out.println(year + "is a leap year");
	}else{
	System.out.println(year + "is not a leap year");
	}}
	}
