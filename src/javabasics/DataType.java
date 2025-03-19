package javabasics;

import java.util.Scanner;
import java.util.logging.Logger;

public class DataType {
	//create logger instance for the class DataType
	private static final Logger logger = Logger.getLogger(DataType.class.getName());
	
	void checkDataType() {
		Scanner scan = new Scanner(System.in);
		logger.info("enter the value");
		 // Read the input as a string to handle very large numbers
		String input  = scan.nextLine().trim();
		try {
			// Try to parse the input as a long (largest primitive integer type)
			long number =Long.parseLong(input);
			if (number>=Byte.MIN_VALUE && number<=Byte.MAX_VALUE) {
				logger.info("the number is a byte");
			}
			if (number>=Short.MIN_VALUE && number<=Short.MAX_VALUE) {
				logger.info("the number is a Short");
			}
			if (number>=Integer.MIN_VALUE && number<=Integer.MAX_VALUE) {
				logger.info("the number is a Integer");
			}
			if (number>=Long.MIN_VALUE && number<=Long.MAX_VALUE) {
				logger.info("the number is a Long");
			}
		}
		catch (NumberFormatException e) {
			
			logger.info("please enter a valid number");
			
		}
		}
	public static void main(String[] args) {
		DataType dataTypeObj = new DataType();
		dataTypeObj.checkDataType();
	}

}
