package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "alex", 500.00, 0.01));
		
		list.add(new BusinessAccount(1002, "maria", 1000.0, 400.0));
		
		list.add(new SavingsAccount(1004, "bob", 300.0, 0.01));
		
		list.add(new BusinessAccount(1005, "anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("total balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list ) {
			System.out.printf("update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance() );
			
		}
	}
}