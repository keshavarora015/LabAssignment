package Assignment1;

import java.util.Scanner;

public class CopyOfArrayTester {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of array");
		int length=scan.nextInt();
		int array[]=new int[length];
		System.out.println("enter array");
		for(int i=0;i<length;i++)
		{
			array[i]=scan.nextInt();
		}
		CopyOfArray.Copy(array);
		CopyOfArray.print(array);
		//applying changes
		array[length-1]=55;
		CopyOfArray.print(array);
	}
}
