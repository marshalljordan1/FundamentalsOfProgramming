package m8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		menu();
		
	}
		public static byte menu() {
			Scanner sc = new Scanner(System.in);
			byte option;
			final byte MIN = 0;
			final byte MAX = 5;

			do {
				System.out.println("Main menu");
				System.out.println("0.- Exit the application");
				System.out.println("1.- Create a client");
				System.out.println("2.- Eliminate client");
				System.out.println("3.- Create a customer account");
				System.out.println("4.- Deposit euros into a customer's account");
				System.out.println("5.- Withdraw euros from a customer's account");
				option = sc.nextByte();
				if (option < MIN || option > MAX) {
					System.out.println("Choose a valid option");
				}
			} while (option > MIN && option < MAX);
			
			return option;
		}
}		
		public static void createClient(ArrayList<Client> listClients) {
			
			String name = ("Enter name of client");
			String surname = ("Enter surname of client");
			
			Client client = searchClient(name, surname, listClients);
			
			if (client != null) {
				System.out.println("The client " + name + " " + surname + " already exists");
			} else {
				Client client1 = new Client(name.toUpperCase(), surname.toUpperCase());
				listClients.add(client1);
				
				System.out.println("\n New client\n" + client1.getName() + " " + client1.getSurname() + "\n successfully added");
			}
		}
		
		private static Client searchClient(String name, String surname, ArrayList<Client> listClients) {
		
			Client clientSearch = null;
			//boolean found = false;
			int i = 0;
			int size = listClients.size();
			
			while(clientSearch == null && i < size) {
				if(name.equalsIgnoreCase(listClients.get(i).getName()) && surname.equalsIgnoreCase(listClients.get(i).getSurname())) {
					//found == true;
					clientSearch = listClients.get(i);
				}
				i++;
			}
			return clientSearch;
		}
		
		public static void showClients (ArrayList<Client> listClients) {
			if (listClients.size() == 0) {
				System.out.println("There are no clients to show");
			} else {
				System.out.println("List of clients");
			}
			for (Client client : listClients) {
				
			}
			
			private static Client enterDetailsClient(ArrayList<Client>listClients) {
				
				System.out.println("Client details");
				String name;  
				System.out.println("Introduzca el nombre");
				name = sc.nextLine();
				String surname;
				System.out.println("Introduzca el apellido");
				surname = sc.nextLine();
				
				return searchClient(name, surname, listClients);
			}
				
				private static Account enterDetailsClient(Client client) {
					return searchAccountClient(client.getAccounts());
				}
				
					private static void mostrarCuenta(Client c) {
				for (Account account : c.getAccounts ()) {
				System.out.println("N°" + Account.getNumAccount()+" Balance " + Account.getBalance() + "€");
				}
		}
		
}