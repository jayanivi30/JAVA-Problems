package problems;
import java.util.*;
public class reverseAString {
	public static void main(String srgs[]) {
		Scanner sc =new Scanner(System.in);
		String name;
		System.out.println("Enter a string: ");
		name=sc.next();
		String sb = new StringBuilder(name).reverse().toString();
		System.out.print("Reversed string: "+ sb);
		sc.close();
	}

}
