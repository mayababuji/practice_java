package javabasics;
import java.util.Scanner;
import java.util.logging.Logger;

public class Factorial {
	//create a logger instance for the class
	private static final Logger logger = Logger.getLogger(Factorial.class.getName());
	
	static int factorial(int num) {
		
		int fact = 1;
		int i;
		
		for (i=2;i<=num;i++) {
			fact =fact * i;
			
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		logger.info("Enter the number ");
		int number = scanner.nextInt();
		Factorial factObj = new Factorial();
		int fact = factObj.factorial(number);
		logger.info("The factorial of the number "+number+" is "+ fact);
		
	}

}
