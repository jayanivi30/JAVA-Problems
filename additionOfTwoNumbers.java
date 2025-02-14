package Basics;
import java.util.*;

public class additionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x , y;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		sum = x + y;
		System.out.println("The sum of the two numbers is: "+sum);
		sc.close();
		

	}

}
