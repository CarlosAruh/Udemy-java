package course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.ProductComp;

public class Program56 {

	public static void main(String[] args) {

		List<ProductComp> list = new ArrayList<>();

		list.add(new ProductComp("Tv", 900.0));
		list.add(new ProductComp("Notebook", 1200.0));
		list.add(new ProductComp("Tablet", 400.0));

		// Função anonima/arrow function
		Comparator<ProductComp> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		list.sort(comp);

		for (ProductComp p : list) {
			System.out.println(p);
		}

	}

}
