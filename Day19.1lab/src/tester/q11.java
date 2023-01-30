package tester;

import FIS.Computable;

public class q11 {

	public static void main(String[] args) {
		Computable co = (a,b) -> {
		return (a/b);
		};
		System.out.println("output = "+ co.compute(20, 10));
		}
}
