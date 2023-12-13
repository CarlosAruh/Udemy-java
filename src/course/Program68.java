package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmployeePipe;

public class Program68 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		System.out.print("Enter salary: ");
		Double midSalary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<EmployeePipe> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new EmployeePipe(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (e1,e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
			
			List<String> email = list.stream()
					.filter(e -> e.getSalary() > midSalary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", midSalary) + ":");
			email.forEach(System.out::println);
			
			Double nameSal = list.stream()
					.filter(e -> e.getName().charAt(0)=='M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': "+ nameSal);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
