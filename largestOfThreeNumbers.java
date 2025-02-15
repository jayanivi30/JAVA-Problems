package Miniproj;
import java.util.*;
public class largestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		System.out.println("Enter 3 numbers; ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		num3=sc.nextDouble();
		if(num1>num2 && num1>num3) {
			System.out.println("The GREATEST number is "+num1);
		}
		else if(num2>num3) {
			System.out.println("The GREATEST number is "+num2);
		}
		else {
			System.out.println("The GREATEST number is "+num3);
		}
		sc.close();
		

	}

}
