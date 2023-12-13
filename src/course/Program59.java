package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program59 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
		//List<Integer> list = List.of(0, 1, 2, 3, 4);
		
		Integer sum = 0;
		for (Integer x :list){
			sum += x;
		}
		
		
		
		Integer sumExpressive = list.stream().reduce(0, Integer::sum);
		
		System.out.println(sumExpressive);
	}

}
