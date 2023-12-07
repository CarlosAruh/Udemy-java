package course;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program52 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		System.out.print("How many students in curse A: ");
		Integer numA = sc.nextInt();
		for(int i=0; i<numA; i++) {
			courseA.add( sc.nextInt());
		}

		Set<Integer> courseB = new HashSet<>();
		System.out.print("How many students in curse B: ");
		Integer numB = sc.nextInt();
		for(int i=0; i<numB; i++) {
			courseB.add( sc.nextInt());
		}
		
		Set<Integer> courseC = new HashSet<>();
		System.out.print("How many students in curse C: ");
		Integer numC = sc.nextInt();
		for(int i=0; i<numC; i++) {
			courseC.add( sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
				
		System.out.println("Total students:" + total.size());
		
		sc.close();
	}

}
