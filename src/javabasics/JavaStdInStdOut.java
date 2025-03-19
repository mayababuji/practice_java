package javabasics;

import java.util.Scanner;
import java.util.logging.Logger;

public class JavaStdInStdOut {
	//create a logger instance for the class JavaStdInStdOut
	private static final Logger logger =  Logger.getLogger(JavaStdInStdOut.class.getName());

	void checkJavaStdInOut(){
		Scanner scanner = new Scanner(System.in);
		logger.info("Enter the double number");
		double dvalue = scanner.nextDouble();
		logger.info("Enter the number");
		int number = scanner.nextInt();
		logger.info("Enter the string");
		String str = scanner.nextLine();
		
		logger.info("String is "+str);
		logger.info("Integer  is "+number);
		logger.info("Double value  is "+dvalue);
		scanner.close();
		

	}
	public static void main(String[] args) {
		//Create a new object of the JavaStdInStdOut class. Assign this object to the variable stdObj 
		//Now, stdObj can be used to access the methods and fields of the JavaStdInStdOut class.
		JavaStdInStdOut stdObj = new JavaStdInStdOut();
		stdObj.checkJavaStdInOut();
	}
}
