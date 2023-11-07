package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int reg = sc.nextInt();
		sc.nextLine();
		System.out.println(" ");
		
		List<Employee> emp = new ArrayList<>();

		for (int i = 0; i < reg; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			emp.add(new Employee(id, name, salary));
			System.out.println("");
		}

		System.out.print("Enter the employee ID that will be have salary increase: ");
		int ei = sc.nextInt();
		sc.nextLine();

		int index = -1;

		for (int i = 0; i < emp.size(); i++) {
			Employee employee = emp.get(i);
			if (employee.getId() == ei) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Enter the percentage: ");
			double per = sc.nextDouble();
			sc.nextLine();
			emp.get(index).sal(per);
		} else {
			System.out.println("This ID does not exist!");
		}
		
		System.out.println("");
		System.out.println("List of employee:");
		for(Employee x: emp) {
			System.out.println(x);
		}

		sc.close();
	}

}
