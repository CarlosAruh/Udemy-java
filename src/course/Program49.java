package course;

import java.util.Set;
import java.util.TreeSet;

import entities.ProductSet;

public class Program49 {
	public static void main(String[] args) {

		Set<ProductSet> set = new TreeSet<>();
		set.add(new ProductSet("TV", 900.0));
		set.add(new ProductSet("Notebook", 1200.0));
		set.add(new ProductSet("Tablet", 400.0));
		
		ProductSet prod = new ProductSet("Notebook", 1200.0);
		
		
		for (ProductSet p : set) {
			System.out.println(p);
		}
		
		System.out.println(set.contains(prod));
	}
}
