import java.util.Scanner;

public class M7_2_4 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int n;
		boolean isPrime;
		
		System.out.println("Choose a number: ");
		n = num.nextInt();
		
		isPrime = findPrime(n);
		
		if (isPrime) {
		System.out.println("the number "+n+" is a prime number");
		}
		else 
			System.out.println("the number "+n+" is NOT a prime number");
		num.close();
	}

	private static boolean findPrime(int n) {
		
		boolean isPrime = true;
		int i = 2;
		
		if (n>1) {
			while (isPrime && i < n) {
				if (n % i == 0) {
					isPrime = false;
				}
				i++;
			}
		} else {
			isPrime = false;
		}
		return isPrime;
	}
		
}

/*   OTHER METHOD BUT LESS EFFICIENT:
 * 
 * for (int i = 2; i < n; i++) {
 * 		if (n % i == 0) {
 * 			isPrime = false;
 * 		}
 * 		i++;
 * } 								*/
