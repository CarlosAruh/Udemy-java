package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Prod;
import services.CalculatorService;

public class Program45 {

	public static void main(String[] args) {

		List<Prod> list = new ArrayList<>();

		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Prod(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Prod x = CalculatorService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		}

	}

}
