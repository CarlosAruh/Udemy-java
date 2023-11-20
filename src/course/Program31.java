package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program31 {

	public static void main(String[] args) {
		
		List<TaxPayer> emps = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=n;i++) {
			System.out.println("Tax payer #"+ i+ " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			type = Character.toUpperCase(type);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double income = sc.nextDouble();
			sc.nextLine();
			if (type == 'I') {
				System.out.print("Health expenditures: ");
				Double helth = sc.nextDouble();
				emps.add(new Individual(name, income, helth));
			}else if(type=='C') {
				System.out.print("Number of employees: ");
				Integer employee = sc.nextInt();
				emps.add(new Company(name, income, employee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		Double sum = 0.0;
		for (TaxPayer emp : emps) {
			System.out.println(emp);
			sum += emp.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " +String.format("%.2f", sum));
		
		sc.close();

	}

}
