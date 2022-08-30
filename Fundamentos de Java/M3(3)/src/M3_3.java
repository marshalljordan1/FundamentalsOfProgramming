import java.util.Scanner;

public class M3_3 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float num1 = num.nextByte();
		System.out.println("Enter second number: ");
		float num2 = num.nextByte();
		System.out.println("Enter third number: ");
		float num3 = num.nextByte();
		
		float sum = ((num1 + num2 + num3) / 3);
		System.out.println("The average of these three numbers is: "+sum);
		num.close();
	}

}