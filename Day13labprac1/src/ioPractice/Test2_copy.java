package ioPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test2_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the filename and path");
		try (Scanner sc = new Scanner(System.in);
				BufferedReader b1 = new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter p1 = new PrintWriter(new FileWriter(sc.nextLine(), true));) {

			String line = null;
			while ((line = b1.readLine()) != null) {
				p1.println(line);
		}
			System.out.println(" file copy done ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
