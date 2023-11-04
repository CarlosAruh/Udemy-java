package course;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		double soma = 0;

		double[] vect = new double[num];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		System.out.print("SOMA = " + soma);
		System.out.println();
		System.out.print("MEDIA = " + soma/vect.length);
		
		sc.close();
	}

}
