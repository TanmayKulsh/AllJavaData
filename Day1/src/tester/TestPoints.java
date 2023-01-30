package tester;

import com.cdac.geometry.Point2D;

import java.util.Iterator;
import java.util.Scanner;

public class TestPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("How many points ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		Point2D[] arr = new Point2D[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the x cordinate :");
			x = sc.nextInt();
			System.out.println("Enter the y cordinate :");
			y = sc.nextInt();
			Point2D point = new Point2D(x, y);
			arr[i] = point;
		}
		// printing array
		for (Point2D n : arr) {
			System.out.println(n.show());
		}

		System.out.println("Enter the indices for the FIRST point");
		System.out.println("Enter the x and y cordinate : ");
		Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());

		System.out.println("Enter the indices for the SECOND point");
		System.out.println("Enter the x and y cordinate : ");
		Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());

		if (p1.isEqual(p2)) {
			System.out.println("Can't calculate the distance because both the points are at same location.");
		} else if (!(p1.isEqual(p2))) {
			p1.calculateDistance(p2);
		}

	}
}
