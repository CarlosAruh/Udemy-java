package course;

import java.util.Arrays;

public class Program57 {

	public static int globalValue = 3; //resultado depende de dados de entrada

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}

	}

}
