package problems;
import java.util.*;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String input;
		System.out.println("Enter a string: ");
		input = sc.next();
		String reversed = new StringBuilder(input).reverse().toString();
		
		if(input.equalsIgnoreCase(reversed)) {
			System.out.println("It is a palindrome");
			
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
		sc.close();

	}

}
