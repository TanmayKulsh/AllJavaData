package tester;

import q2.funcInter;

public class q1_1 {

	public static void main(String[] args) {

		funcInter obj = ((a,b) -> System.out.println("sum = "+ (a+b))); 
		obj.add(20, 20);
	}
}
