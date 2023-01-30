package tester;
import com.app.core.Customer;
import com.app.core.ServicePlan;
import static utils.ValidationRules.*;
import static utils.ValidationRules.parseAndValidateDob;
import custom_exception.CustomerHandlingException;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static utils.Populate.populateCustomerDetails;

public class CMS {

	public static void main(String[] args) throws CustomerHandlingException, ParseException {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			//int phase
			//get a populated AL < jCusytomer > from CSMutils
			List<Customer> customerList = populateCustomerDetails();
			boolean exit = false;
			while(!exit) {
				System.out.println("Options\n1. Customer registration\n2. Display details of all registered customers\n3 Customer login\r\n"
						+ "\n4. Change Password \n5. Un subscribe customer\n6. Display names of the customers born between 2 specified dates.\n7. Display all the customer details ,who have chosen specific plan\n10. Exit");
				try {
					switch(sc.nextInt()) {
					case 1:
//						System.out.println("Enter the details of the customer in order \n name, email, password, regAmount, dob, Service plan");
//						Customer c1=new Customer(sc.next(),validateDuplicate(customerList, validateEmail(sc.next())) ,validatePassword(sc.next()),sc.nextDouble(),parseAndValidateDob(sc.next()),validateSP(sc.next()));
//						customerList.add(c1);
//						System.out.println("customer registered"); 
//						break;
						System.out.println("Enter The Details of Customer: name, email, password, regAmount, dob, Service plan");
						Customer c1 = validateCustomer(sc.next(), sc.next(),sc.next(), sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(c1);
						
					case 2:
						System.out.println("Customer Details");
						for(Customer c: customerList) {
							System.out.println(c);
						}
						break;
						
					case 3:
						System.out.println("Enter your email : ");
						String eml=validateEmail(sc.next());
						System.out.println("Enter your password");
						String psd= validatePassword(sc.next());
						if(validateLogin(customerList, eml, psd)) {
							System.out.println("Logged In.... | ^_^ |");
						}
						break;	
					
					case 4:
						System.out.println("Enter your email : ");
						String emil=validateEmail(sc.next());
						System.out.println("Enter your password");
						String pssd=validatePassword(sc.next());
						System.out.println("Enter the new password");
						String npsd = validatePassword(sc.next());
						if(changePass(customerList, emil, pssd, npsd)) {
							System.out.println("Password Changed | ^_^ |");
						}
						break;	
				
					case 5:
						
						
						
						break;	
					
					case 6:
						break;	
					
					case 7:
						break;
					
					case 10:
						exit=true;
						
						break;	
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
			}
			
		}// JVM : sc.close()

	}

	private static String checkDuplicateEmail(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
