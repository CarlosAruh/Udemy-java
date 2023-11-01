package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Bank h;
		
		
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
				
		//Bank h = ;
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char ini = sc.next().charAt(0);
		
		if (ini == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble(); 
			h = new Bank(number, holder, initialDeposit);
		}else {
			h = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Accont data:");
		System.out.println(h);
		
		System.out.print("Enter a deposit value: ");
		h.deposit(sc.nextDouble());
		System.out.println("Updated accont data:");
		System.out.println(h);
		
		System.out.print("Enter a whithdraw value: ");
		h.whithdraw(sc.nextDouble());
		System.out.println("Updated accont data:");
		System.out.println(h);
		
		sc.close();
	}

}
