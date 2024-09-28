package examplegit;
import java.util.Scanner;
public class Examplegit {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int num=sc.nextInt();
			if(num%2==0)
			{
				System.out.println("The entered number is even ");
			}else
			{
				System.out.println("the entered number is odd");
			}
		}
}
