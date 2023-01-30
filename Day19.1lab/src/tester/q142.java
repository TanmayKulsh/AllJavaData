package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> list = new HashMap<>();
		list.put(1,87);
		list.put(2,835);
		list.put(3,45);
		list.put(4,454);
		list.put(5,787);
		list.put(6,335);
		list.put(7,545);
		list.put(8,646);
		list.put(9,89);		
		list.forEach((p,q) -> System.out.println("key : "+p +"  Value : "+q+" "));		
	}
}
