import java.util.ArrayList;

// Donat el següent arraylist de nombres: [15,16, 19, 66, 88, 79, 97] 
// Crea un altre arraylist amb els nombres primers que hi ha en el primer arraylist.

public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(15);
		numbers.add(16);
		numbers.add(19);
		numbers.add(66);
		numbers.add(88);
		numbers.add(79);
		numbers.add(97);

		System.out.print(numbers + "\n");

		ArrayList<Integer> prime = new ArrayList<Integer>();

		for (int i = 0; i < numbers.size(); i++) {
			boolean isPrime;
			isPrime = findPrime(numbers.get(i));

			if (isPrime == true)
				prime.add(numbers.get(i)); 
				
		}
		System.out.print(prime + "\n");
	}

	private static boolean findPrime(int n) {

		boolean isPrime = true;
		int i = 2;

		if (n > 1) {
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
