package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Products product = new Products(name, price, quantity);
		
		System.out.println("Product data: " + product);
		
		
		sc.close();
	}

}
