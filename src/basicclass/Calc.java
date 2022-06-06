package basicclass;
import java.util.*;

public class Calc {
					
			public int add(int i,int j)
			{
				int sum = i+j;	
				return sum;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
							Calc c = new Calc();
							Scanner sc=new Scanner(System.in);
							System.out.print("Enter First number:");
							int i = sc.nextInt();
							System.out.print("Enter Second number:");
							int j = sc.nextInt();
							int sum= c.add(i,j);
							System.out.print("Sum of two numbers:"+sum);		
							}

}
