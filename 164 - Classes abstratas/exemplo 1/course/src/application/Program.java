package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "alex", 1000.0);

		Account acc2 = new SavingsAccount(1002, "maria", 1000.0, 0.01);

		Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
		
	}
}