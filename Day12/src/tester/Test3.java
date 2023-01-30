package tester;
import com.app.fruits.*;


public class Test3 {

	public static void main(String[] args) {
		Fruit f = new Mango();//up casting
		((Alphonso)f).pulp();   // invalid casting exc : mango cant be cast to alphonso
//		Alphonso a = new Mango();
		Alphonso a = (Alphonso) new Mango();
		System.out.println("What willl happen ???????");
	}
}
