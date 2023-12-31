package entities;

public class ProductOO {

	protected String name;
	protected Double price;

	public ProductOO() {

	}

	public ProductOO(String name, Double price) {
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

	public String priceTag() {
		return name + " $ "	+ String.format("%.2f", price);
	}

}
