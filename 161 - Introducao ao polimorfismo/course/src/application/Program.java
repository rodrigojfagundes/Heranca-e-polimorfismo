package application;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//POLIMORFISMO -> Basicamente � uma variavel no nosso exemplo variavel do TIPO ACCOUNT
		//pode retornar valores diferente... Pois a X � um OBJETO de Account o q da um resultado
		//
		//e a variavel do tipo ACCOUNT Y � um OBJETO do tipo SavingsAccount e por isso da outros
		//resultados...
		Account x = new Account(1020, "alex", 1000.0);
		
		//criando um OBJETO q vai ser uma variavel do tipo ACCOUNT
		//q vai receber um OBJETO do tipo SavingsAccount que � uma SUBCLASSE da classe ACCOUNT
		Account y = new SavingsAccount(1023, "maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}
}
