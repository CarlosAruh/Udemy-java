package course;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program60 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
				
		
		//(p1,p2) inferencia de tipos
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.forEach(System.out::println);
	}

}
