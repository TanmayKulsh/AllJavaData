package utils;

import static com.app.core.Customer.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exception.CustomerHandlingException;

public class ValidationRules {

	public static Date checkDate;
	static {
		try {
			checkDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("ERR IN STATIC BLOCK");
		}
	}

	public static String validateEmail(String email) throws CustomerHandlingException {
		String pattern = "^[\\w\\.-]+@[\\w\\.-]+(com|org|net)$";
		if (email.matches(pattern))
			return email;
		throw new CustomerHandlingException("Invalid Email!!!!!!!");
	}

	// add a static method for pwd validation
	public static String validatePassword(String pwd) throws CustomerHandlingException {
		String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#$@*%^!]).{5,10}";
		if (pwd.matches(pattern))
			return pwd;
		throw new CustomerHandlingException("Invalid Password");
	}

//	add a static method to parse date and validate it
	public static Date parseAndValidateDob(String dob) throws ParseException, CustomerHandlingException {
		Date dobDate = sdf.parse(dob);
		if (dobDate.before(checkDate))
			return dobDate;
		throw new CustomerHandlingException("Invalid Dob!!!!!!!");
	}

	public static String validateDuplicate(List<Customer> arr, String email) throws CustomerHandlingException {
		Customer c = new Customer(email);
		if (arr.contains(c))
			throw new CustomerHandlingException("Duplicate Email-id Found!!!!!");
		return email;
	}

	public static ServicePlan validateSP(String sPln) throws CustomerHandlingException {
		try {
			return ServicePlan.valueOf(sPln.toUpperCase());
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Available plans \n ");
			sb.append(Arrays.toString(ServicePlan.values()) + "\n");
			sb.append("Choose correct plan !");

			// wrong plan
			throw new CustomerHandlingException(sb.toString());
		}
	}

	public static boolean validateLogin(List<Customer> list, String email, String password)
			throws CustomerHandlingException {
		Customer cst = new Customer(email, password);
		for (Customer c : list) {
			if ((c.equals(cst)) && (c.getPassword().equals(password))) {
				return true;
			}
		}
		throw new CustomerHandlingException("Login Failed!  Please try again ....");
	}

	public static boolean changePass(List<Customer> list, String email, String password, String newPass)
			throws CustomerHandlingException {
		Customer cst = new Customer(email, password);
		for (Customer c : list) {
			if ((c.equals(cst)) && (c.getPassword().equals(password))) {
				c.setPassword(newPass);
				return true;
			}
		}
		throw new CustomerHandlingException("Operation Failed! ( invalid credentials! )  Please try again ....");
	}

//	public static String checkDuplicateEmail(List<Customer> list,String email) throws CustomerHandlingException {
//		Customer cust = new Customer(email);
//		if(list.contains(cust)) {
//			throw new CustomerHandlingException("Email is already registered");
//		}
//		return cust.getEmail();
//	}
//	

	// add a static method to invoke the alll validation rules: this method will be
	// invoked by the tester

	public static Customer validateCustomer(String name, String email, String password, double regAmount, String date,
			String plan, List<Customer> list) throws CustomerHandlingException, ParseException {
		// email validation
		validateEmail(email);
		// invoke all validation rules --in case of the success --wrap cust in the cust
		// object n return reference to the caller
		validatePassword(password);
		validateSP(plan);
		parseAndValidateDob(date);

		return new Customer(name, email, password, regAmount, parseAndValidateDob(date),validateSP(plan));
//		for (Customer c : list) {
//			if (c.getEmail().equals(email))
//				;
//			return c;
//		}
//		throw new CustomerHandlingException("invalid Customer");
	}

}
