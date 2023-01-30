package ioPractice;

import java.io.File;
import java.util.Scanner;

public class Test3_sum {

	public static void main(String[] args) {
		System.out.println();
//		D:\hard_core_java
		try (Scanner sc = new Scanner(System.in); Scanner sc2 = (new Scanner(new File(sc.nextLine())))) {
			int sum = 0;
			while (sc2.hasNextInt())
				sum = sum+ sc2.nextInt();
			System.out.println("Sum " + sum);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
