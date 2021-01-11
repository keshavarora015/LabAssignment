package Assignment1;

import java.util.Scanner;

public class GradesAverageTester {
public static void main(String[] args) {
	System.out.println("Enter number of Students");
	Scanner scan=new Scanner(System.in);
	int numberStudents=scan.nextInt();
	GradesAverage grade=new GradesAverage(numberStudents);
	grade.compute();
	grade.printAvg();
	scan.close();
}
}
