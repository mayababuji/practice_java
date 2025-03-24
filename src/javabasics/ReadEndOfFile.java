package javabasics;

import java.util.Scanner;
import java.util.logging.Logger;

 
//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
public class ReadEndOfFile {
	//create a logger instance for the class ReadEndOfFile
	private static final Logger logger = Logger.getLogger(ReadEndOfFile.class.getName());
	
	void readEndOffile() {
		Scanner scanner =new Scanner(System.in);
		int lineNumber = 0;// Initialize line number counter
		logger.info("enter the contents");
		// Read input until EOF
		
		while (scanner.hasNext()) {
			String line = scanner.nextLine();// Read the next line
			logger.info(lineNumber + " " +line); // Print line number and content
			lineNumber++;// Increment line number
			
		}
		scanner.close();
	}
	public static void main(String[] args) {
		ReadEndOfFile  readEndOfLineObj = new ReadEndOfFile();
		readEndOfLineObj.readEndOffile();
	}

}
