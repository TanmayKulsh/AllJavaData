package generics;

import java.util.ArrayList;
import static generics.GenUtils.addMango;

import fruits.Alphonso;
import fruits.Mango;

public class Test4 {

	public static void main (String[] args) {
		ArrayList<Mango> mangoes = new ArrayList<>();
		addMango(mangoes,new Mango());
		
		// because arraylist is alphonsoes type, but argument must be a super type of Mango
		//	ArrayList<Alphonso> alphonsoes = new ArrayList<>();
		//	addMango(alphonsoes,new Alphonso());
		
		
	}
}
