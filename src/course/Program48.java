package course;

import entities.ClientHash;

public class Program48 {

	public static void main(String[] args) {

		ClientHash c1 = new ClientHash("Maria", "maria@gmail.com");
		ClientHash c2 = new ClientHash("Maria", "maria1@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));

	}

}
