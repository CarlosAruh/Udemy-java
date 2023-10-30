package entities;

public class CurrencyConverter {
	
	public double price;
	public double quantity;
	
	public static double conv(double quantity, double price ) {
		double res = quantity * price;
		double iof = res * 6.0 / 100.0;
		return res + iof;
	}
}
