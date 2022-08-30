package car_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Car_search {

	public static void main(String[] args) {

		Scanner search = new Scanner(System.in);
		String brand;
		int i = 0;

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Clio");
		cars.add("Toyota");
		cars.add("Vauxhaul");

		do {
			i++;
			System.out.println("Search a car brand: ");
			brand = search.nextLine();

			if (cars.contains(brand)) {
				System.out.println("This car is available\n");
			} else {
				System.out.println("This car is not available\n");
			}
		} while (i >= 0);
		search.close();
	}
}