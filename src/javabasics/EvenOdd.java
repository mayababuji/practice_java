package javabasics;
import java.util.Scanner;
import java.util.logging.Logger;

public class EvenOdd {
	// Create a logger instance for the class
	private static final Logger logger = Logger.getLogger(EvenOdd.class.getName());
	public void  checkEvenOdd(int num) {
		// Check if the number is odd or even
		
		int reminder = num%2;
		if (reminder == 0) {
			logger.info("The number "+num +" is even");
			
		}
		else{
			logger.info("The number "+num + " is odd");
		}
	
		
	}
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);
		// Prompt the user to enter a number
		logger.info("Enter the number");
		int number = scanner.nextInt();
		// Close the scanner
		scanner.close();
		EvenOdd evenoddObj = new EvenOdd();
		evenoddObj.checkEvenOdd(number);
		
		
	}

}
