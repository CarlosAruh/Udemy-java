package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int num = sc.nextInt();
		sc.nextLine();

		Aluno[] est = new Aluno[num];

		for (int i = 0; i < est.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("1ª Nota: ");
			double nota1 = sc.nextDouble();
			sc.nextLine();
			System.out.print("2ª Nota: ");
			double nota2 = sc.nextDouble();
			sc.nextLine();

			est[i] = new Aluno(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados:");
		for (int i = 0; i < est.length; i++) {
			double media = (est[i].getNota1() + est[i].getNota2())/ 2;
			if (media >= 6.0) {
				System.out.println(est[i].getAluno());
			}
		}

		sc.close();
	}

}
