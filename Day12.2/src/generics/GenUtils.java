package generics; 
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenUtils {

	public static void printDetails(Collection<?> coll) {
//		for(Object o: coll) {
//			System.out.println(o);
//		}
		Iterator<?> itr = coll.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	public static <T> void printDetails2(Collection<T> collection) {
//		for(T t:collection)
//			System.out.println(t);
		//iterTOR
		Iterator <T> itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static double getSquareRoot (Collection<? extends Number> collection) {
		double sum=0;
		double sqr=0;
		Iterator<? extends Number> itr = collection.iterator();
		while(itr.hasNext()) {
			sum=sum+itr.next().doubleValue();		}
		return Math.sqrt(sum);
		}
	
}
