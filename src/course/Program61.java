package course;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program61 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.9));
		
		//list.removeIf(new ProductPredicate()); interface 
		//list.removeIf(Product :: staticProductPradicate);  method reference static
		//list.removeIf(Product :: nonStaticProductPradicate); method reference non static
		//Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		//list.removeIf(pred); Lambda declarada PEGA INPUT
		Double min = 100.00;
		
		list.removeIf(p -> p.getPrice() >= min);
	
		
		for(Product p: list) {
			System.out.println(p);
		}

	}

}
