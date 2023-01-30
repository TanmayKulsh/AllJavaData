package utils;

import static utils.ValidationRules.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custom_exception.CustomerHandlingException;

public class Populate {
	private ServicePlan s;
	public static List<Customer>  populateCustomerDetails() throws CustomerHandlingException,ParseException 
	{
	ArrayList<Customer> customers = new ArrayList<>(1000);	
	customers.add(new Customer("Tanmay","tanmaykuls99@gmail.com","Tanmay@123",1000.00,parseAndValidateDob("20-01-1994"),validateSP("DIAMOND")));
	customers.add(new Customer("Yash","yash123@gmail.com","Yash@123",1000.00,parseAndValidateDob("20-01-1993"),validateSP("GOLD")));
	customers.add(new Customer("Abhinav","abhinav123@gmail.com","Abhi@123",1000.00,parseAndValidateDob("20-01-1993"),validateSP("SILVER")));
	
	
	// String name, String email, String password, double regAmount, Date dob, ServicePlan plan
	
	return customers;
	}
}