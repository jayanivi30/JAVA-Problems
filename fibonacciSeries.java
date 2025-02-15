package Miniproj;
import java.util.*;
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("Enter number of fibonacci numbers to be printed: ");
		n=sc.nextInt();
		int f=0, s=1;
		for(int i =1;i<=n;i++) {
			System.out.print(f+" ");
			int next=f+s;
			f=s;
			s=next;
		}

	}

}
