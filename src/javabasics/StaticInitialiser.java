package javabasics;
import java.util.Scanner;
//validate the breadth and height of the parallelogram before calculating its area:
public class StaticInitialiser {
	static int breadth;
	static int height;
	static boolean flag;
	static {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the breadth and height");
		breadth = scanner.nextInt();
		height = scanner.nextInt();
		if (breadth>0 && height >0) {
			flag=true;
		}
		else {
			
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		
	}
		
	}
	public static void main(String[] args) {
	
		if (flag) {
			System.out.println(breadth*height);
		}		
	}
		
	
}
