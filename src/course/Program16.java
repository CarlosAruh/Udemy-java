package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();

		Pessoa[] pes = new Pessoa[num];
		int velho = 0;
				
		for (int i = 0; i < pes.length; i++) {
			System.out.printf("Dados da %dª pessoa: %n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			pes[i] = new Pessoa(nome, idade);
			velho = Math.max(pes[i].getIdade(), velho);
		}
		for (int i = 0; i < pes.length; i++) {
			if(pes[i].getIdade() == velho) {
				System.out.printf("PESSOA MAIS VELHA: " + pes[i].getNome());
			}
		}
		
		

		sc.close();
	}

}
