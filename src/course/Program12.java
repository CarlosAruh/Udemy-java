package course;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[num];
		
		double maior = 0;
		int pos = 0;
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		for(int i=0;i<vect.length;i++) {
			maior = Math.max(vect[i], maior);
			if(vect[i] == maior) {
				pos = i;
			}
		}
		
		System.out.println("");
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		
		sc.close();
	}

}
