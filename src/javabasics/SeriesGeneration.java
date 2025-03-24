package javabasics;
import java.util.Scanner;

//value1= value1(i+1)+value2 X(i-1)

public class SeriesGeneration {

	void seriesGeneration() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value1");
		int value1  = scanner.nextInt();
		System.out.println("enter value1");
		int value2  = scanner.nextInt();
		System.out.println("enter N");
		int N  = scanner.nextInt();
		for (int i=0;i<N;i++) {
			System.out.print(value1); 
			if (i < N - 1) {
                System.out.print(" "); // Print a space if it's not the last term
            }
			value1  += value2 * Math.pow(2,i);
			
		}
		System.out.println();
		scanner.close();
		
	}
	public static void main(String[] args) {
		SeriesGeneration seriesGenObj = new SeriesGeneration();
		seriesGenObj.seriesGeneration();
	}
}
