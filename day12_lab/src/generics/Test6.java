package generics;

import java.util.LinkedHashMap;
import java.util.Map.Entry;;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(10, "ten");
		map.put(1,"One");
		map.put(5, "five");

		map.put(6, "five");
		map.put(7, "five");
		map.put(8, "five");
		map.put(9, "five");
		
		System.out.println("LHM :");
		System.out.println(map);
		for (int k : map.keySet()) {
			System.out.println(k);
		}
		
		for (String s : map.values()) {
			System.out.println(s);
		}
		System.out.println("Entries");
		for(Entry<Integer, String> entry : map.entrySet())
			System.out.println("Key : "+entry.getKey()+ "value : "+entry.getValue());
		
				
	}

}
