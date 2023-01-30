package tester;
import static generics.GenUtils.*;

import java.util.List;
import java.util.Set;

import com.app.fruits.Orange;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 20, 30, 40, 50); // auto boxing
		printDetails(list);
		printDetails2(list);
		Set<Double> doubleSet = Set.of(1.08,2.02,3.46,4.77,5d);
		printDetails(doubleSet);
		
		// fruit tester
		
		List<Orange> oranges=List.of(new Orange(),new Orange(),new Orange());
		displayTaste(oranges);
	}
}
