package Assignment1;

import java.util.Scanner;

public class TimeTableTester {
	public static void main(String[] args) {
		System.out.println("Enter the number you want in table");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		TimeTable obj =new TimeTable(number);
		obj.initializeTable();
		obj.print();
		scan.close();
	}
	}
