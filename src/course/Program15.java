package course;

import java.util.Locale;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[num];
		int soma = 0;
		int contador = 0;
		double media = 0;
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<vect.length;i++) {
			if(vect[i] %2 == 0) {
				soma += vect[i];
				contador++;
			}
		}
		
		media = soma/contador;
		
		if (soma != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
