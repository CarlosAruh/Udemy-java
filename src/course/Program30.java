package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductOO;
import entities.UsedProduct;

public class Program30 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ProductOO> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tag = sc.next().charAt(0);
			tag = Character.toUpperCase(tag);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (tag == 'C') {
				products.add(new ProductOO(name, price));
			} else if (tag == 'I') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else if (tag == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactoreDate = sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactoreDate));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");

		for (ProductOO product : products) {
			System.out.println(product.priceTag());
		}

		sc.close();
	}

}
