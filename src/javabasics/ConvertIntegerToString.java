package javabasics;
import java.util.Scanner;
import java.util.logging.Logger;
/*For most cases, use String.valueOf() because it works with all types (int, double, long, etc.).
For performance-sensitive code, consider StringBuilder.
*/

public class ConvertIntegerToString {
	//create a logger instance for the class ConvertIntegerToString
	private static final Logger logger = Logger.getLogger(ConvertIntegerToString.class.getName());
	static String convertIntToStr(int num) {
		//String str = Integer.toString(num); // Method 1: Integer.toString()
		//String str = String.valueOf(num);// Method 2: String.valueOf()
		//String str = num + ""; // Method 3: Concatenation
		//String str = new StringBuilder().append(num).toString(); // Method 4: StringBuilder
		String str = String.format("%d", num); // Method 5: String.format()
		return str;
		
	}
	
public static void main(String[] args) {
	ConvertIntegerToString intToStrObj = new ConvertIntegerToString();
	Scanner scanner = new Scanner(System.in);
	logger.info("Enter the number");
	int num = scanner.nextInt();
	String str = intToStrObj.convertIntToStr(num);
	logger.info(str);
	scanner.close();
}


}
