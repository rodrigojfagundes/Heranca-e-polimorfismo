package entities;

//essa classe vai ter a TAXA de JUROS

//classe SavingsAccount... Q HERDA atributos e metodos da classe Account
	//OBS: por ter o FINAL isso IMPEDE q OUTRA CLASSE possa HERDAR metodos e atributos
	//da classe SavingsAccount
public final class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//o OVERRIDE a baixo serve para dizer q e uma SOBREPOSICAO... Ou seja, q tem um METODO
	//com o MESMO NOME(withdraw) mas na classe ACCOUNT(que é a classe MAE), porem o metodo
	//withdraw a baixo NÂO desconta 5% de taxa
	@Override
	//aqui nos estamos implementando o METODO de SAQUE... Porem do dinheiro q ta na POUPANCA
	public void withdraw(double amount) {
		balance -= amount;
	}
}
