import java.util.Scanner;

public class M7_4 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		int num1, num2;
		boolean check;
		
		do {
			System.out.println("Enter number 1: ");
			num1 = data.nextInt();
			System.out.println("Enter number 2: ");
			num2 = data.nextInt();
		
			check = checkNeg(num1, num2);
		} while (check == true);
			System.out.println("One of the numbers is negative");
			data.close();
		}
	
	private static boolean checkNeg(int num1, int num2) {
		
		boolean check = true;
		
		/* if ((num1 <= 0 && num2 >= 0) || (num1 >= 0 && num2 <= 0)) {
			check = false; 
			}
			*/
		
		if ((num1 * num2) < 0) { //if you multiply a negative by a positive answer is negative
			check = false;
		}
		return check;
	}
}
