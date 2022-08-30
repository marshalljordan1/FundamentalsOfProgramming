package m8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	private String name;
	private String surname;
	private ArrayList<Account> accounts;
	
	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.accounts = new ArrayList<Account>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public static void get(int position) {
		// TODO Auto-generated method stub
		
	}
	
}
