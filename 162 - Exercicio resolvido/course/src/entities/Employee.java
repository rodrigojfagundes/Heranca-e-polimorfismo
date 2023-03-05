//resumindo: foi feito uma LISTA do TIPO EMPLOYEE, mas a INSTANCIA de cada OBJETO
//tanto pode ser EMPLOYEE ou OUTSOURCEDEMPLOYEE... e Dependendo do q foi instanciado
//(EMPLOYEE ou OUTSOURCEDEMPLOYEE) o comportamento(resultado) sera diferente
//sendo assim o POLIMORFISMO

package entities;

public class Employee {

	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {}

	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}
}
