package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import static generics.GenUtils.findMaxNumber;

public class Test5 {

	public static void main(String[] args) {

		// find the maximum value in the collection
		ArrayList<Integer> l1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,19,-34));
		System.out.println("ksjdfhi "+findMaxNumber(l1));
		
		//Vector<String> strings= new Vector<>(List.of("avskjdhf", "asygfuysgd","ashgdf"));
	
		
		//	LinkedList<LocalDate> dates =  new LinkedList<>() 
	
	}

}
