package javabasics;

import java.util.Scanner;
import java.util.logging.Logger;
public class LeapYear {
	// Create a logger instance for the class
		private static final Logger logger = Logger.getLogger(LeapYear.class.getName());
	 void leapyear(int year) {
		if(year%4 == 0) {
			logger.info("The year "+ year+ " leap");
		}
		else {
			logger.info("The year "+ year+ " is not leap");
		}
	}
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	logger.info("Enter the year");
	int year = scanner.nextInt();
	LeapYear leapyearObj = new LeapYear();
	leapyearObj.leapyear(year);
	scanner.close();
	
}
}
