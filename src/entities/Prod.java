package entities;

public class Prod implements Comparable<Prod>{

	private String name;
	private Double price;

	public Prod() {

	}

	public Prod(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Prod o) {
		return price.compareTo(o.getPrice());
	}
}
