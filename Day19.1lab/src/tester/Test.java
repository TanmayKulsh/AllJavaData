package tester;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(87);
		list.add(835);
		list.add(45);
		list.add(454);
		list.add(787);
		list.add(335);
		list.add(545);
		list.add(646);
		list.add(89);

		Integer intt = list.stream().filter(p -> p % 2 != 0).mapToInt(p -> p).sum();
		System.out.println("Total = "+intt);
	}

}
