package problems;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int product = 1;
		for(int i=num;i>0;i--) {
			product *= i;
		}
		System.out.printf("The factorial of %d is: %d",num,product);
		
		
		
		
		sc.close();

	}

}
