package Assignment1;

public class Fibonacci {
 private int var1=1;
 private int var2=1;
 private double sum=var1+var2;
 
 Fibonacci(){
	 System.out.print(var1);
	 System.out.print(" "+ var2); 
 }
 
 public void average()
 {
	 for(int i=2;i<20;i++)
	 {
		 int temp=var1+var2;
		 System.out.print(" "+temp);
		 var1=var2;
		 var2=temp;
		 sum+=temp;
	 }
	 System.out.println();
	 System.out.println("Average :" + (sum/20.0));
 }
 
 
 
}
