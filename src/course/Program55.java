package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer vote = Integer.parseInt(fields[1]);		
				
				if(votes.containsKey(name)) {
					int update = votes.get(name);
					votes.put(name, update + vote);
				}else {
					votes.put(name, vote);
				}
				
				line = br.readLine();
				
				
			}
			for (String name : votes.keySet()) {
				System.out.println(name + ": " +votes.get(name));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		

		sc.close();
	}

}
