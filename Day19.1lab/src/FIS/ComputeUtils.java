package FIS;

public interface ComputeUtils extends Computable {

	//SAM
	
	// static method
	static double perform(double a, double b) {
		Computable obj = (d, c) -> {
			return a / b;
		};
		return obj.compute(a, b);
	}
}
