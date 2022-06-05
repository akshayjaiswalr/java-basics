package arrayExample;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int size=input.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
			//update
	}

}
