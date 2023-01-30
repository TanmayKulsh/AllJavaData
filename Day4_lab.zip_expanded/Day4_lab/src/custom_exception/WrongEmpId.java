package custom_exception;
@SuppressWarnings("serial")
public class WrongEmpId extends Exception{
	public WrongEmpId(String mesg) {
		super(mesg);
	}
}
