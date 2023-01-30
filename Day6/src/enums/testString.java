package enums;
import java.util.Scanner;
import enum2.Color;
import static enum2.Color.*;

public class testString {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String s = "hello";
			String s1 = new String("hello");
			StringBuffer s2 = new StringBuffer(s);
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1 == s);
			System.out.println(s.equals(s2));
			for (Color c : values()) {
				System.out.println(c);

			}
			Color color = valueOf(sc.next().toUpperCase());
			System.out.println("You chose "+ color);
			System.out.println();
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		System.out.println("main continous");
	}
}
