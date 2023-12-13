package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.ProductService;

public class Program64 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.9));
		
		ProductService ps = new ProductService();
		
		Double sum = ps.filteredSum(list, p -> p.getName().charAt(0)=='T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
