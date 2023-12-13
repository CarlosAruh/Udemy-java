package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program62 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.9));

		// list.forEach(new PriceUpdate());
		//list.forEach(Product::nonStaticPriceUpdate);
		Double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); Lambda declarada
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);

	}

}
