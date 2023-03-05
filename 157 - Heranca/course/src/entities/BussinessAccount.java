package entities;


public class BussinessAccount extends Account {
	
	private Double loanLimit;

	public BussinessAccount() {
		super();
	}

	//criando o construtor BussinesAccount q HERDOU os atributos da classe Account
	//herdou o number, holder e o balance... e ele tem de diferente o LOANLIMIT
	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//o SUPER serve para dizer q o number, holder e o balance são da CLASSE MÂE
		//ou seja q esses atributos são herdados de outra classe
		super(number, holder, balance);
		//o THIS.loanLimit serve para dizer q NÂO é herdado o LOANLIMIT e q ele é dessa classe mesmo
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	//metodo/funcao para fazer emprestimo... q vai receber um AMOUNT(quantidade) de valor
	//q queremos emprestada
	public void loan(double amount) {
		//ai nos vamos passar para a funcao DEPOSIT/DEPOSITO a quantidade de valor q pegamos
		//emprestado e depositar nela... 
		//							FOI FEITO ASSIM PARA SIMPLIFICAR :)
		//so vamos emprestar se o valor q estamos pedindo for MENOR q o Limite de VALOR para
		//emprestimo
		if (amount <= loanLimit) {
			//balance q e o saldo da conta recebe ele mesmo(balance) + MAIS a quantia q foi
			//pedida em EMPRESTIMO (AMOUNT)... e MENOS o valor da TAXA que é 10.0
			balance += amount -10.0;
		}
	}
}
