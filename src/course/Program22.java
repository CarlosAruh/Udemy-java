package course;

import java.util.Locale;
import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Colunas: ");
		int c = sc.nextInt();
		System.out.print("Linhas: ");
		int l = sc.nextInt();

		Integer[][] mat = new Integer[c][l];

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < l; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Localizar número: ");
		int loc = sc.nextInt();

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < l; j++) {
				if(mat [i][j] == loc) {
					System.out.println("Position: "+i+","+j);
					System.out.println(j - 1 >= 0 ? "Left: "+mat[i][j-1] : "Não tem");
					System.out.println(j + 1 < l ? "Rigth: "+mat[i][j+1] : "Não tem");
					System.out.println(i - 1 >= 0 ? "Up: "+mat[i-1][j] : "Não tem");
					System.out.println(i + 1 < c ? "Down: "+mat[i+1][j] : "Não tem");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
