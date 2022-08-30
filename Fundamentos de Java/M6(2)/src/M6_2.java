import java.util.Scanner;

public class M6_2 {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int numPers;
		float med;
		
		System.out.println("How many ages would you like to calculate the average of?");
		numPers = data.nextInt();
		
		med = avage(numPers);
		
		System.out.println("The average age of these people is: " +med+"");
		data.close();
	}
	
	public static float avage(int numPers) {
		Scanner data = new Scanner(System.in);
		float med;
		int age;
		int totalages = 0;
		int i = 0;
		
		while (i < numPers) {
			System.out.println("Enter age " + (i + 1) + ": ");
			age = data.nextInt();
			
			if (age >= 0 && age <= 120) {
				totalages = totalages + age;
				i++;
			} else {
				System.out.println("Age must be between 0 - 120");
			}
		}
		data.close();
		med = (float)totalages / numPers;
		return med;
	}
}