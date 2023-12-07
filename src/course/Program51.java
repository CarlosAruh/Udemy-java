package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entities.User;

public class Program51 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String path = "c:\\temp\\in.txt";

		Set<User> users = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				users.add(new User(userName, moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: "+ users.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}