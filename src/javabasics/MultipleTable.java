package javabasics;
import java.util.Scanner;
import java.util.logging.Logger;


public class MultipleTable {
	//create instance for logger for the class MultipleTable
	private static final Logger logger = Logger.getLogger(MultipleTable.class.getName());
	void multipleTable() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = scanner.nextInt();
		for (int i =0;i<=10;i++) {
			int result = num*i;
			System.out.printf("%d x %d = %d%n", num, i, result);
			//System.out.println(num+ "X"+i+"="+num*i);
		}
		scanner.close();
	
	}
	public static void main(String[] args) {
		MultipleTable multipleTableObj = new MultipleTable();
		multipleTableObj.multipleTable();
	}
}
