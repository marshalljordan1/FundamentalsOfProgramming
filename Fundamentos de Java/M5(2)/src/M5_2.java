import java.util.Scanner;

public class M5_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		byte i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		byte num1 = sc.nextByte();
		System.out.println("enter second number:");
		byte num2 = sc.nextByte();
		sc.close();
		if (num1 == num2) {
			System.out.println("numbers can't be the same!");
		} else {
			if (num1 > num2) {
				byte aux = num1;
				num1 = num2;
				num2 = aux;
			}
		for (i = num1; i <= num2; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println("The sum of all the numbers between "+num1+" and "+num2+" is "+sum+"");
		}
	}
}