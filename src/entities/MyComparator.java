package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<ProductComp> {

	@Override
	public int compare(ProductComp p1, ProductComp p2) {
		// TODO Auto-generated method stub
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
