package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeOO;
import entities.OutsourcedEmployee;

public class Program29 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeOO> emps = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsorced (y/n) ");
			char out = sc.next().charAt(0);
			out = Character.toUpperCase(out);
			sc.nextLine();

			if (out == 'Y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double additional = sc.nextDouble();

				EmployeeOO emp = new OutsourcedEmployee(name, hours, valuePerHour, additional);

				emps.add(emp);
			} else {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				sc.nextLine();
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();

				EmployeeOO emp = new EmployeeOO(name, hours, valuePerHour);

				emps.add(emp);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (EmployeeOO emp: emps) {
			System.out.println(emp.getName()+ " - $ "+String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}
