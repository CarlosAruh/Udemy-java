package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.DomainException;

public class Program33 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double whitdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, whitdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amouth = sc.nextDouble();
		
		account.withdraw(amouth);
		
		System.out.println(account);
		}catch(DomainException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
	
		
		sc.close();
	}

}
