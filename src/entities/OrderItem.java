package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double subTotal() {
		return quantity * price;
	}

	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
