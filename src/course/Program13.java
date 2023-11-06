package course;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");		
		int num = sc.nextInt();
		sc.nextLine();
		int[] vect1 = new int[num];
		int[] vect2 = new int[num];
				
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<vect1.length; i++) {
			vect1[i]=sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<vect2.length; i++) {
			vect2[i]=sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i < vect1.length; i++) {
			vect1[i] += vect2[i];
			System.out.println(vect1[i]);
		}
		
		sc.close();
	}

}
