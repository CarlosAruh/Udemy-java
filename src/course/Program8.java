package course;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int num ;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		num = sc.nextInt();
		
		int[] vect = new int[num];
		
		if (num <= max){
			for(int i=0; i<vect.length; i++) {
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt();
			}
			System.out.println("NUMEROS NEGATIVOS");
			for(int i=0; i<vect.length; i++) {
				if(vect[i]<0 ) {
					System.out.println(vect[i]);
				}
			}
			
		}else {
			System.out.println("INSIRA ATÉ 10 NÚMEROS");
		}
		
		
		
		
		sc.close();
	}

}
