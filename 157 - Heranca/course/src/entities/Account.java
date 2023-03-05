package entities;


public class Account {
	
	private Integer number;
	private String holder;
	//balance é do tipo PROTECT pois ele e vai ser acessado a partir da classe BUSSINESSACCOUNT
	//q é uma SUBCLASSE da classe ACCOUNT, pois a classe BussinessAccount HERDA atributos
	//da class Account
	protected Double balance;
	
	//criando um construtor vazio
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	//funcao/metodo para fazer o SAQUE de dinheiro
	//e RECEBE um atributo chamado AMOUNT que é o valor q queremos TIRAR/SACAR da conta
	public void withdraw(double amount) {
		balance -= amount;	
	}
	

	public void deposit(double amount) {
		balance += amount;		
	}
}
