package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductOO{
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactoreDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactoreDate) {
		super(name, price);
		this.manufactoreDate = manufactoreDate;
	}

	public Date getManufactoreDate() {
		return manufactoreDate;
	}

	public void setManufactoreDate(Date manufactoreDate) {
		this.manufactoreDate = manufactoreDate;
	}
	
	public String priceTag() {
		return getName() 
				+ " (USED)"
				+ " $ "
				+ String.format("%.2f", getPrice())
				+" (Manufactore date: "
				+ sdf.format(getManufactoreDate())
				+")";
	}
	
}
