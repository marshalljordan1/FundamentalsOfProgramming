package m8_4Main;

import java.util.ArrayList;
import java.util.Scanner;
import herencia.Building;
import herencia.Cinema;
import herencia.Hospital;
import herencia.Hotel;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Building> listBuildings = new ArrayList<Building>();
		
		Cinema odeon = new Cinema("Odeon", 15, 4000, 100);
		Cinema vue = new Cinema("Vue", 30, 2500, 100);
		Hotel hilton = new Hotel("Hilton", 25, 1000, 50);
		Hotel raddison = new Hotel("Raddison Blu", 25, 1000, 50);
		Hospital castleHill = new Hospital("Castle Hill", 25, 1000, 1300);
		Hospital hullRoyal = new Hospital("Hull Royal", 25, 1000, 700);
		
		listBuildings.add(odeon);
		listBuildings.add(vue);
		listBuildings.add(hilton);
		listBuildings.add(raddison);
		listBuildings.add(castleHill);
		listBuildings.add(hullRoyal);
		
		System.out.println(listBuildings);
		
		boolean exit = false;
		
		do {
			switch (mainMenu()) {
			case 1:
				createBuilding(listBuildings);
				break;
			case 2:
				showBuilding(listBuildings);
				break;
			case 3:
				deleteBuilding(listBuildings);
				break;
			case 4:
				showAllBuildings(listBuildings);
				break;
			case 0:
				System.out.println("Thank you for using this application.");
				exit = true;
			}
		} while (!exit);
		
		System.out.println(listBuildings);
	}
	
private static byte mainMenu() {
	Scanner sc = new Scanner(System.in);
	
		byte option;
		final byte MIN = 0;
		final byte MAX = 4;
		
		do {
			System.out.println("\n*** MAIN MENU ***\n");
			System.out.println("1. Register a new building");
			System.out.println("2. Show building");
			System.out.println("3. Remove building");
			System.out.println("4. Show all buildings");
			System.out.println("0. Exit application\n");
			option = sc.nextByte();
			
			if (option < MIN || option > MAX) {
				System.out.println("Choose a valid option!");
			}
		} while (option < MIN || option > MAX);
		return option;
	}
	
	private static void showBuilding(ArrayList<Building> listBuildings) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of building: ");
		String name = sc.nextLine();
		
		Building building = searchBuilding(name, listBuildings);
		int i = 0;
		
		while (building != null && i == 0) {
			System.out.println(building.toString());
			System.out.println(building.CalculatingCostSurveillance());
			System.out.println(building.clean());
		 if (building instanceof Hospital) {
				System.out.println(((Hospital)building).Lunch());
		} else if (building instanceof Hotel) {
				System.out.println(((Hotel)building).roomService());
		} else {
				System.out.println(((Cinema)building).projectorSession(27, 6));
		}
		 i = 1;
		}
		while (building == null) {
		System.out.println("the building "+ name +" does NOT exist"); 
		}
	}
	

	
	private static void showAllBuildings(ArrayList<Building> listBuildings) {
		Scanner sc = new Scanner(System.in);
		
		for(Building building : listBuildings) {
			System.out.println("\n"+building.toString());
			System.out.println(building.clean());
			System.out.println(building.CalculatingCostSurveillance());
			if (building instanceof Hotel) {
				System.out.println(((Hotel)building).roomService()+"\n");
			} else if (building instanceof Cinema) {
				System.out.println(((Cinema)building).projectorSession(10,7)+"\n");
			} else {
				System.out.println(((Hospital)building).Lunch()+"\n");
			}
		}
	}


	private static Building searchBuilding(String name, ArrayList<Building> listBuildings) {
		Scanner sc = new Scanner(System.in);
		
		Building building = null;
		int i = 0;
		
		while (building == null && i < listBuildings.size()) {
			if (listBuildings.get(i).getName().equalsIgnoreCase(name)) {
				building = listBuildings.get(i);
			}
			i++;
			}
		return building;
		}


	private static void createBuilding(ArrayList<Building> listBuildings) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of building: ");
		String name = sc.nextLine();
		
		if (searchBuilding(name, listBuildings) != null) {
			System.out.println("the building "+ name +" already exists");
			
		} else {
			System.out.println("Enter number of floors: ");
			int numFloors = sc.nextInt();

			System.out.println("Enter total surface area of the building: ");
			int surfaceArea = sc.nextInt();
			
			System.out.println("Enter type of building: \n1. Hotel \n2. Hospital \n3. Cinema\n");
			int type = sc.nextInt();
			
			switch (type) {
			case 1: 
				System.out.println("Enter number of rooms: ");
				int numRooms = sc.nextInt();
				Hotel hotel = new Hotel(name, numFloors, surfaceArea, numRooms);
				listBuildings.add(hotel);
				break;
			case 2: 
				System.out.println("Enter number of patients: ");
				int patients = sc.nextInt();
				Hospital hospital = new Hospital(name, numFloors, surfaceArea, patients);
				listBuildings.add(hospital);
				break;
			case 3: 
				System.out.println("Enter capacity: ");
				int capacity = sc.nextInt();
				Cinema cinema = new Cinema(name, numFloors, surfaceArea, capacity);
				listBuildings.add(cinema);
				break;
			default: 
				System.out.println("You have chosen an invalid option.");
			}
		}
	}


	private static void deleteBuilding(ArrayList<Building> listBuildings) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of building: ");
		String name = sc.nextLine();
		
		Building building = searchBuilding(name, listBuildings);
		int i = 0;
		
		if (building == null) {
			System.out.println("the building "+ name +" does NOT exist");
		} else {
			while (building != null && i < listBuildings.size()) {
				if (listBuildings.get(i).getName().equalsIgnoreCase(name)) {
					listBuildings.remove(i);
					System.out.println("The hotel has been removed from our database.");
				}
				i++;
			}
		}
	}
}
