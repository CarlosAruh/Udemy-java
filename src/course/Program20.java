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
			Integer id = sc.nextInt();
			while(hasId(emp, id)) {
				System.out.println("ID alredy taken! Try again: ");
				System.out.print("ID: ");
				id = sc.nextInt();
			}
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
		int idSalary = sc.nextInt();
		sc.nextLine();

		int index = -1;

		/*
		 * Employee emp = list.stream().filter(x -> x.getId() ==
		 * idSalary).findFirst().orElse(null); if(emp = null){
		 * System.out.println("This id not exist!");  }else { System.out.println(); entra
		 * operação
		 */

		for (int i = 0; i < emp.size(); i++) {
			Employee employee = emp.get(i);
			if (employee.getId() == idSalary) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Enter the percentage: ");
			double per = sc.nextDouble();
			sc.nextLine();
			emp.get(index).increaseSalary(per);
		} else {
			System.out.println("This ID does not exist!");
		}

		System.out.println("");
		System.out.println("List of employee:");
		for (Employee x : emp) {
			System.out.println(x);
		}

		sc.close();
	}
	
	public static boolean hasId(List <Employee>emp,int id) {
		Employee ex = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return ex !=null;
	}

	/*
	 * Função auxiliar: (op)public !static! Interger* position (List<Employee>
	 * list(outro escopo), int id) { for (int i=0; i<list.size(); i++){
	 * if(list.get(i).getId() == id){ Return i; } }return null; } *int return -1
	 * 
	 * **Interger pos = position(list, (captura do ID))
	 * 
	 * ***list.get(pos).increaseSalary(captura da %)
	 */

}
