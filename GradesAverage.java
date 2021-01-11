package Assignment1;

import java.util.Scanner;

public class GradesAverage {
	private int numStudents;
	private double sum = 0.0;
	private int arr[];
	private int grade = 0;
	

	public GradesAverage() {
	}

	public GradesAverage(int numStudents) {
		this.numStudents = numStudents;
		arr = new int[numStudents + 1];
	}

	public void compute() {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		while (counter<numStudents) {
			System.out.println("Enter the grades of Student " + (counter+1));
			grade = scan.nextInt();
			while (grade < 0 || grade > 100) {
				System.out.println("Invalid Grade Try Again");
				System.out.println("Enter the grades of Student " + (counter+1));
				grade = scan.nextInt();
			}
			arr[counter] = grade;
			sum+=arr[counter];
			counter++;
		}
		scan.close();
	}
	public void printAvg()
	{
		//double temp=numStudents*1.0;
		System.out.println("Avg :" + sum/numStudents);
	}
}

