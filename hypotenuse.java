package Miniproj;
import java.util.*;
public class hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side a: ");
		double a = sc.nextDouble();
		System.out.println("Enter length of side b: ");
		double b = sc.nextDouble();
		double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("The hypotenuse of the triangle is : "+c+"cm.");
		sc.close();

	}

}
