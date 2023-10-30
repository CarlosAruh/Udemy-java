package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.println("Enter grade points: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", student.calcGrade());
		
		if(student.calcGrade()<60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.finalGrade());
		}else {
			System.out.println("PASSED");
		}
		
		sc.close();
	}

}
