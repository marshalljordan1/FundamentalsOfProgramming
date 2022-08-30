import java.util.ArrayList;
import java.util.Scanner;

public class M5_5 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		ArrayList<String> scholarships = new ArrayList<String>();
		final int scholarship = 5;
		String name, degree, dole;
		int age;
		char deg, job;
		
		do {
		System.out.println("Enter name: ");
		name = data.nextLine();
		
		System.out.println("Enter age: ");
		age = data.nextByte();
		data.nextLine();
		
		System.out.println("Do you have a University degree?: ");
		degree = data.nextLine();
		degree.toLowerCase();
		deg = degree.charAt(0);
		
		System.out.println("Are you employed?: ");
		dole = data.nextLine();
		dole.toLowerCase();
		job = dole.charAt(0);
		
		if ((age >= 18 && deg == 'y') || job == 'n') {
			scholarships.add(name);
			System.out.println("\nCongratulations, "+ name +", you have a scholarship!");
		} else {
			System.out.println("\nSorry, "+ name +", you don't have a scholarship.");
		}
		
		} while (scholarships.size() < scholarship);
		
			System.out.println("Students with a scholarship are: \n");
			for(int i=0;i<scholarships.size();i++) {
				System.out.println(scholarships.get(i));
			}
		data.close();
	}
}