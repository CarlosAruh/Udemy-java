package course;

import java.io.File;
import java.util.Scanner;

public class Program36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter folder path: ");
		String srtPath = sc.nextLine();

		File path = new File(srtPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		Boolean success = new File(srtPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);

		sc.close();
	}

}
