package course;

import java.util.Locale;
import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int num = sc.nextInt();
		sc.nextLine();
		double menor = 100.0;
		double maior = 0;
		double soma = 0;
		int contador = 0;
		int contadorM = 0;
		
		double[] altura = new double[num];
		char[] sexo = new char[num];
		
		for(int i=0;i<altura.length;i++) {
			System.out.printf("Altura da %dª pessoa:", i + 1);
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Genero da %dª pessoa:", i + 1);
			sexo[i] = sc.next().charAt(0);
			sexo[i] = Character.toUpperCase(sexo[i]);
			sc.nextLine();
				
			menor = Math.min(altura[i], menor);
			maior = Math.max(altura[i], maior);
			
			if(sexo[i]=='F') {
				soma += altura[i];
				contador++;
			}
			if(sexo[i]=='M') {
				contadorM++;
			}
		}
		
		double media = soma/contador;
		System.out.println("Menor altura = "+ menor);
		System.out.println("Maior altura = "+ maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = "+ contadorM);
		
		sc.close();
	}

}
