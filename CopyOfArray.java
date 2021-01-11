package Assignment1;

import java.util.Arrays;

public class CopyOfArray {

	private static int newarray[];
	
	public static int[] Copy(int array[]) {
		
		newarray=Arrays.copyOf(array,array.length);
		return newarray;
	}


//public class CopyOfArray {
//
//	public static int[] Copy(int array[]) {
//		int newArray[]=new int[array.length];
//		for(int i=0;i<array.length;i++)
//		{
//			newArray[i]=array[i];
//		}
//		
//		return newArray;
//	}
	public static void print(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

}
