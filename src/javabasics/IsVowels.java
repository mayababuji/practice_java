package javabasics;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class IsVowels {
	// Create a logger instance for the class
		private static final Logger logger = Logger.getLogger(IsVowels.class.getName());
	public static  void isvowelSwitch(char charac) {
		
		charac = Character.toLowerCase(charac);
		switch (charac) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			logger.info("The character is a vowel");
			
			break;
			
		default:
			if (charac>='a' && charac<='z') {
				
				logger.info("The character is a consonant");
				
			}
			else {
				
				logger.info("The character is not a valid alphabet");
			}
			break;
		
		}
		

		
	}
	
	public void isvowelArray(char charac) {
		charac = Character.toLowerCase(charac);
		//Define a list of vowels
		List<Character> vowels  =Arrays.asList('a','e','i','o','u');
		if (vowels.contains(charac)) {
			logger.info("The character " +charac + " is a vowel");
			
		}
		else if (charac>='a' && charac<='z' ) {
			logger.info("The character " +charac + " is a constant");
			
		}
		else {
			logger.info("The character is not a valid alphabet");
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		logger.info("Enter the character");
		char charac = scanner.next().charAt(0);
		IsVowels isvowelObj = new IsVowels();
		isvowelObj.isvowelSwitch(charac);
		isvowelObj.isvowelArray(charac);
		scanner.close();
		
		
	}

}
