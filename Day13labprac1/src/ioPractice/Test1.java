package ioPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
//	1. Accept name of the text file from user(scanner) . Read the data from the file , in a buffered manner, till EOF n display the same.
	System.out.println("Enter the file name");
		try(Scanner sc = new Scanner(System.in)) {
		
			BufferedReader br = new BufferedReader(new FileReader(sc.next()));
			System.out.println("elements ");
//			String s = null;
			while(br.readLine()!=null) {
				System.out.println(br.readLine());
				System.out.println("Data read ovre!!!!!!");
			}
		}
		
		catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println("main over ......");
	}
}
