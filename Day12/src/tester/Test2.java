package tester;
import com.app.fruits.*;


public class Test2 {

	public static void main(String[] args) {
		Fruit f = new Alphonso();//up casting
		System.out.println(f.taste());//DMD
		((Mandarine)f).juice();
		
	}

}
