package Basics;
import java.util.*;
public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num+" is EVEN.");
		}
		else{
			System.out.println(num+" is ODD.");
		}
		sc.close();

	}

}
