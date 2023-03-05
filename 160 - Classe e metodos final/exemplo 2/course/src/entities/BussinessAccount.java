package entities;

public class BussinessAccount extends Account {
	
	private Double loanLimit;
	
	public BussinessAccount() {
		super();
	}


	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount -10.0;
		}
	}
	
	//criando o metodo WITHDRAW para SACAR dinheiro
	@Override
	public void withdraw(double amount) {
		//chamado o metodo/funcao WITHDRAW da classe MAE/SUPER Classe (Account), atraves do
		//SUPER
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
