import java.util.Scanner;

public class M4_2 {
	
	public static void main(String[] args) {
		
	Scanner data = new Scanner(System.in);
	System.out.println("Enter first name: ");
	String name = data.nextLine();
	System.out.println("Enter surname: ");
	String surname = data.nextLine();
	System.out.println("Enter age: ");
	int age = data.nextByte();

	if (age <= 5) {
	System.out.println(name +" "+ surname + ": Nursery");
	} 
	if (age >=6 && age <= 11) {
		System.out.println(name +" "+ surname + ": Primary");
		} 
	if (age >= 12 && age <= 15) {
		System.out.println(name +" "+ surname + ": Secondary");
		} 
	if (age >= 16 && age <= 17) {
		System.out.println(name +" "+ surname + ": College");
		} 
	else {
		System.out.println(name +" "+ surname + ": University");
	}
		data.close();
	}
}