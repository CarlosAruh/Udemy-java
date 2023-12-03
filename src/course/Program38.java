package course;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductReader;

public class Program38 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ProductReader> prs = new ArrayList<>();

		System.out.println("Enter path in: ");
		String path = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);

				prs.add(new ProductReader(name, price, quantity));

				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		File file = new File("c:\\temp\\out\\summary.csv");
		File parentDir = file.getParentFile();

		if (!parentDir.exists()) {
			if (!parentDir.mkdirs()) {
				System.out.println("Erro");
			}
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			for (ProductReader pr : prs) {
				bw.write(pr.toString());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
