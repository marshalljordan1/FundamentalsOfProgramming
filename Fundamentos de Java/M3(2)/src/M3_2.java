import java.util.Scanner;

public class M3_2 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = num.nextInt();
		System.out.println("Enter second number: ");
		int num2 = num.nextInt();
		
		
		int sum = (num1 + num2);
		System.out.println("The addition of these two numbers is: "+sum);
		sum = (num1 - num2);
		System.out.println("The subtraction of these two numbers is: "+sum);
		sum = (num1 * num2);
		System.out.println("The multiplication of these two numbers is: "+sum);
		sum = (num1 / num2);
		System.out.println("The division of these two numbers is: "+sum);
		num.close();
	}

}