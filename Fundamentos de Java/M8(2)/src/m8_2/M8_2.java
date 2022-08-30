package m8_2;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Hotel> arrayHotels = new ArrayList<Hotel>();
		
		Hotel hotel1 = new Hotel("Ritz", 56, 5, 3400);
		Hotel hotel2 = new Hotel("Marriot", 60, 4, 4400);
		Hotel hotel3 = new Hotel("Premier Inn", 100, 8, 6200);
		
		arrayHotels.add(hotel1);
		arrayHotels.add(hotel2);
		arrayHotels.add(hotel3);
		showHotels(arrayHotels);
		
		boolean exit = false;

		do {
			switch (menu()) {
			case 1:
				//position = findHotel(arrayHotels);
				createHotel(arrayHotels);
				showHotels(arrayHotels);
				break;
			case 2:
				//position = findHotel(arrayHotels);
				deleteHotel(arrayHotels);
				showHotels(arrayHotels);
				break;
			case 3:
				//position = findHotel(arrayHotels);
				seeHotel(arrayHotels);
				break;
			case 4:
				//position = findHotel(arrayHotels);
				modifyHotel(arrayHotels);
			case 0:
				System.out.println("Thank you for using this application.");
				exit = true;
			}
		} while (!exit);
		
		System.out.println(arrayHotels);
	}
	
	private static byte menu() {
		
		byte option;
		final byte MIN = 0;
		final byte MAX = 4;
		
		do {
			System.out.println("\n*** MAIN MENU ***\n");
			System.out.println("1. Create a new hotel");
			System.out.println("2. Delete a hotel");
			System.out.println("3. Find a hotel");
			System.out.println("4. Modify a hotel");
			System.out.println("0. Exit application\n");
			option = sc.nextByte();
			
			if (option < MIN || option > MAX) {
				System.out.println("Choose a valid option!");
			}
		} while (option < MIN || option > MAX);
		return option;
	}
	
	private static int findHotel(ArrayList<Hotel> arrayHotels) {
		System.out.println("Enter name of hotel: ");
		String hotelName = sc.nextLine();
		boolean found = false;
		int i = 0;
		int size = arrayHotels.size();
		int position = -1;
		
		while (i < size && !found) {
			if (arrayHotels.get(i).getHotelName().equalsIgnoreCase(hotelName)) {
				found = true;
				position = i;
			}
		}
		return position;
	}
	
	private static void createHotel(ArrayList<Hotel> arrayHotels) {
		int position = -1;
		if (position == -1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of hotel: ");
			String hotelName = sc.nextLine();
			
			System.out.println("Enter number of rooms: ");
			int numRooms = sc.nextInt();
			System.out.println("Enter number of floors: ");
			int numFloors = sc.nextInt();

			System.out.println("Enter total surface area of hotel: ");
			int areaHotel = sc.nextInt();

			Hotel hotel = new Hotel(hotelName, numRooms, numFloors, areaHotel);

			arrayHotels.add(hotel);
			hotel.calculateMaintenance();

		} else {
			System.out.println("The hotel you are looking for is not in our database");
		}
	}
	
	public static void showHotels(ArrayList<Hotel> arrayHotels) {
		for (Hotel hotel : arrayHotels) {
			System.out.println(hotel);
		}
	}
	
	private static void deleteHotel(ArrayList<Hotel> arrayHotels) {
		int position = -1;
		if (position == -1) {
			
			System.out.println("The hotel you are looking for is not in our database.");
		} else {
			arrayHotels.remove(position);
			System.out.println("The hotel has been removed from our database.");
		}
	}
	
	public static void seeHotel(ArrayList<Hotel> arrayHotels) {
		if (position == -1) {
			System.out.println("The hotel you are looking for is not in our database.");
		} else {
			System.out.println(arrayHotels.get(position));
			arrayHotels.get(position).calculateMaintenance();
		}
	}

		private static void modifyHotel(ArrayList<Hotel> arrayHotels) {
			int position = -1;
			if (position == -1) {
				System.out.println("The hotel you are looking for is not in our database.");
			} else {
				
				byte input = -1;
				do {
					System.out.println("What would you like to modify? \n 1. Number of rooms \n 2, Number of floors \n 3. Total area");
					input = sc.nextByte();
					if (input < 0 || input > 3);
					System.out.println("Please enter a valid option!");
				} while (input < 3 || input > 3);
				
				switch (input) {
				case 1:
					System.out.println("Enter the NEW number of rooms: ");
					int numRooms = sc.nextInt();
					arrayHotels.get(position).setNumRooms(numRooms);
					System.out.println("The number fo rooms at "+ arrayHotels.get(position).getHotelName( )+" ha sido modificado a  "+ numRooms);
					break;
				case 2:
					System.out.println("Introduzca NUEVO numero de PLANTAS: ");
					int numFloors = sc.nextInt();
					arrayHotels.get(position).setNumFloors(numFloors);
					System.out.println("El numero de plantas del Hotel "+ arrayHotels.get(position).getHotelName() +" ha sido modificado a  "+ numFloors);
					break;
				case 3:
					System.out.println("Introduzca NUEVA superficie total: ");
					int areaHotel = sc.nextInt();
					arrayHotels.get(position).setAreaHotel(areaHotel);
					System.out.println("La superficie Total del Hotel "+arrayHotels.get(position).getHotelName()+" ha sido modificada a "+ areaHotel);
					break;
				}
			}
		}
}

