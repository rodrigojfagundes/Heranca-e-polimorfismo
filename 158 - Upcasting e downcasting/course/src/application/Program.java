package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Account acc = new Account(1001,"Alex", 0.0);

		BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);
	
		//UPCASTING -> é pegar um objeto do tipo BussinessAccount e ATRIBUIR para uma VARIAVEL
		//do tipo ACCOUNT...
		//OBS: Lembrando q Account é a CLASSE MAE/ SUPER CLASSE de BussinessAccount... 
		Account acc1 = bacc;
		Account acc2 = new BussinessAccount(1003,"bob" , 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "anna", 0.0, 0.01);
		
		//DOWNCASTING -> é converter um objeto da SUPERCLASSE para a SUBCLASSE
			
		BussinessAccount acc4 = (BussinessAccount)acc2;
		acc4.loan(100.0);
		
		if(acc3 instanceof BussinessAccount) {
			BussinessAccount acc5 = (BussinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("loan/emprestimo");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("update");
		}
	}
}
