package utils;

import com.app.org.*;
import custom_exception.*;

public class idValidate {
//	int j=count;

	public static void employeeIdValidate(int count, int id, Emp[] arr) throws EmployeeNotFoundException {
		for (int i = 0; i < (count); i++) {
			if (arr[i].getDeptid() == id) {
				System.out.println("Employee is present in the database with details : ");
				System.out.println(arr[i]);
				return;
			}
			else
				throw new EmployeeNotFoundException("Emp not found in database");
		}
	}
	public static boolean employeeNameValidate(Emp[] arr,String fname,String lname) throws EmployeeNotFoundException {
		Emp anotherEmp = new Emp(fname,lname);
		for(Emp e: arr) {
			if(e.equals(anotherEmp)) {
				System.out.println("Employee is present in the database with details : ");
				System.out.println(e.toString());
				return true;
			}
		}
		throw new EmployeeNotFoundException("Employee not found");
	}
}
