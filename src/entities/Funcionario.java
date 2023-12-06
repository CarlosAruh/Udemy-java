package entities;

public class Funcionario implements Comparable<Funcionario>{
	
	private String name;
	private Double salary;
	
	public Funcionario(){
		
	}

	public Funcionario(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Funcionario o) {
		return name.compareTo(o.getName());
		//comparar por salario
		//return salary.compareTo(o.getSalary());
		//Sinal decrescente -
	}
	
	
}
