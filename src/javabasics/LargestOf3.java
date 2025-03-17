package javabasics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class LargestOf3 {
	// Create a logger instance for the class
	private static final Logger logger = Logger.getLogger(LargestOf3.class.getName());
	public static  int largestOf3(int x,int y,int z) {
		
		if (x>y && x>z) {
			logger.info("The largest number is "+x);
			return x;
		}
		else if (y>x && y>z) {
			logger.info("The largest number is "+y);
			return y;
			
		}
		else {
			logger.info("The largest number is "+z);
			return z;
		}
		
		
	}
	public static  int collectionlargestOf3(int x,int y,int z) {
		// create an array and find max using Collections.max() method
		 ArrayList<Integer> integerList = new ArrayList<>();
		 integerList.add(x);
		 integerList.add(y);
		 integerList.add(z);
		 logger.info("The largest number is using collection max method is "+Collections.max(integerList));
		return Collections.max(integerList);
	}
	
	public static  int mathlargestOf3(int x,int y,int z) {
		// Find max using Math.max() method
		int largestNum =Math.max(y, Math.max(x,z));
		logger.info("The largest number is using math max method is "+largestNum);
		return largestNum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		logger.info("Enter the first number");
		int x = scanner.nextInt();
		logger.info("Enter the second number");
		int y = scanner.nextInt();
		logger.info("Enter the third number");
		int z = scanner.nextInt();
		LargestOf3 largestObj = new LargestOf3();
		largestObj.largestOf3(x, y, z);
		largestObj.collectionlargestOf3(x, y, z);
		largestObj.mathlargestOf3(x, y, z);
		scanner.close();
		
		
	}
}
