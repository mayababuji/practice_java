package javabasics;
import java.util.Scanner;
import java.util.logging.Logger;

/*Given an integer, , perform the following conditional actions:

If n  is odd, print Weird
If n is even and in the inclusive range of 2  to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird*/
public class ConditionalStatements {
	//create a logger instance for the class ConditionalStatements
	private static final Logger logger = Logger.getLogger(ConditionalStatements.class.getName());
   void conditionalStatement(int n) {
	  
	   if(n%2 ==0 && (n>=2 && n<=5)) {
		   logger.info("Not Weird");	   
	   }
	   if(n%2 ==0 && (n>=6 && n<=20)) {
		   logger.info("Weird");	   
	   }
	   if (n%2 ==0 && n>20) {
		   logger.info("Not Weird");	 
	   }
	   if (n%2 !=0) {
		   logger.info("Weird");
	   }
   }
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   logger.info("enter the number");
	   int n = scanner.nextInt();
	   ConditionalStatements conditonlObj = new ConditionalStatements();
	   conditonlObj.conditionalStatement(n);
	   scanner.close();
	   
	   
	   		
	   
}
}
