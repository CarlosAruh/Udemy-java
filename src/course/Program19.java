package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Regis;

public class Program19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms for rented? ");
		int num = sc.nextInt();
		sc.nextLine();

		Regis[] rooms = new Regis[10];

		for (int i = 0; i < num; i++) {
			System.out.printf("Rent #%d%n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rooms[room] = new Regis(name, email);
			System.out.println("");
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		

		sc.close();
	}

}
