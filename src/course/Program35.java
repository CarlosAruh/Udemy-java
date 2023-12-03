package course;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program35 {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "C:\\temp\\out.txt";
		//FileWriter(path, true) Não recria o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
