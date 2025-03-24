package javabasics;

/*Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999 .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15  characters.
The second column contains the integer, expressed in exactly 3  digits; if the original input has less than three digits, 
you must pad your output's leading digits with zeroes.
*/
import java.util.Scanner;
import java.util.logging.Logger;

public class OutputFormatting {
	//create instance for Logger for the class OutputFormatting
	private static final Logger logger = Logger.getLogger(OutputFormatting.class.getName());
	void outputFormat() {
		
		Scanner scanner = new Scanner(System.in);
		logger.info("========================================");
		
		for (int i=0;i<=3;i++) {
			String str = scanner.next();
			int num = scanner.nextInt();
			String numStr = String.valueOf(num);// Convert integer to string
			if (numStr.length()<=3) {
				numStr = String.format("%03d", num);// Pad with zeros
				str = String.format("%-15s", str);
			
			}
			
			logger.info(str +numStr);
		}
		logger.info("========================================");
		scanner.close();
	}
public static void main(String[] args) {
	OutputFormatting outformatObj = new OutputFormatting();
	outformatObj.outputFormat();
}
}
