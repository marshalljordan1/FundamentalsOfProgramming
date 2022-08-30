package m8_3;

public class Account {
	
	private static int numAccount;
	private int balance;
	
	public Account(int numAccount, int balance) {
		this.numAccount = numAccount;
		this.balance = balance;
	}
	
	public static int getNumAccount() {
		return numAccount;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int quantity) {
		//this.balance += quantity;
		this.balance = this.balance + quantity;
		return this.balance;
	}
	
	public int withdraw(int quantity) {
		if(this.balance >= quantity)
			this.balance = this.balance - quantity;
		//this.balance -= quantity;
		return this.balance;
	}

}
