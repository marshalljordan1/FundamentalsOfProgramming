import java.util.Scanner;

public class M7_2_5 {

	public static void main(String[] args) {
Scanner num = new Scanner(System.in);
		
		int n;
		boolean isPrime;
		
		do {
		
		System.out.println("Choose a number: ");
		n = num.nextInt();
		
		isPrime = findPrime(n);
		
		} while (isPrime == false);
		
		if (isPrime) {
			System.out.println("Exactly, the number "+n+" is a prime number");
		}
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