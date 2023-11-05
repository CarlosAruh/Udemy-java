package course;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();

		int[] vect = new int[num];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS PARES: ");
		
		int pares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				pares++;
				System.out.print(vect[i]+"  ");
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = " + pares);
		sc.close();
	}

}
