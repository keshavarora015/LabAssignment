package Assignment1;

public class TimeTable {
	private int number;
	private int arr[][];

	 public TimeTable(int number) {
		 arr = new int[number+1][number+1];
		 this.number=number;
	}
	 public void initializeTable()
	 {
		 for (int i = 1; i <= number; i++) {
				for(int j=1;j<=number;j++)
				{
					arr[i][j]=i*j;
				}
			}
	 }
	 
	 public void print()
	 {
		 for(int i=1;i<=number;i++)
		 {
			 for(int j=1;j<=number;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }


}
