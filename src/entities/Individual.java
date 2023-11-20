package entities;

public class Individual extends TaxPayer {

	private Double helth;

	public Individual() {
		super();
	}

	public Individual(String name, Double income, Double helth) {
		super(name, income);
		this.helth = helth;
	}

	@Override
	public double tax() {
		if (getIncome() < 20000.00) {
			return (getIncome() * 0.15) - (helth * 0.5);
		} else {
			return (getIncome() * 0.25) - (helth * 0.5);
		}
	}

	@Override
	public String toString() {
		return getName() + ":" + " $ " + String.format("%.2f", tax());
	}

}
