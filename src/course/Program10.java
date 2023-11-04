package course;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Program10 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.print("Quantos pessoas serão digitadas? ");
			int pes = sc.nextInt();
			sc.nextLine();
			
			Cadastro[] cad = new Cadastro[pes]; 
			
			for (int i=0; i<pes; i++) {
				System.out.printf("Dados da %dª pessoa: %n", i + 1);
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				sc.nextLine();
				
				cad[i] = new Cadastro(nome, idade, altura);
			}
			
			double soma = 0;
			
			for (int i=0; i<cad.length; i++) {
				soma += cad[i].getAltura();
			}
			System.out.println();
			System.out.printf("Altura média: %.2f%n",  soma /cad.length);
			
			ArrayList<String> nomesMenoresDe16 = new ArrayList<>();
			
			
			int contAge = 0;
			for (int i=0; i<cad.length; i++) {
				int age = cad[i].getIdade();
				if (age < 16) {
					String nome = cad[i].getName();
					nomesMenoresDe16.add(nome);
					contAge++;
				}
				
			}
			double porc = (double) contAge / cad.length * 100;
			System.out.println("Pessoas com menos de 16 anos: " + porc+"%");
			
			for (String nome : nomesMenoresDe16) {
			    System.out.println(nome);
			}
			
			
			
			sc.close();
		}

}
