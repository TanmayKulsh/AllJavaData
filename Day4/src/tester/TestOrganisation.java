package tester;

import java.util.Scanner;

import com.app.org.Emp;
import com.app.org.Mgr;
import com.app.org.Worker;
import utils.idValidate;

public class TestOrganisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int count = 0;
		System.out.println("---------------Organisation------------------\n\n");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the maximum numbers of Employees to be hired :");
			int num = sc.nextInt();
			Emp[] org = new Emp[num];
			do {

				System.out.println("\n\nEnter your choice:");
				System.out.println("1. for Hire Manager");
				System.out.println("2. for Hire Worker");
				System.out.println("3. for view all Employees");
				System.out.println("4. for Update Basic Salary ");
				System.out.println("5. for search for the employee name in database");
				System.out.println("6. for vallidating first name and last name of the employee");
				
				choice = sc.nextInt();
				System.out.println("10. for exit App");

				switch (choice) {
				case 1:

					if (count < num) {
						System.out.println("Enter the Manager Details : ");
						System.out.println("Enter First Name : ");
						String firstname = sc.next();
						System.out.println("Enter the last name :");
						String lastname = sc.next();
						System.out.println("Enter the basic salary :");
						double bsal = sc.nextDouble();
						System.out.println("Enter the performance Bonus : ");
						double pb = sc.nextDouble();
						org[count] = new Mgr(firstname, lastname, bsal, pb);
						System.out.println("Employee Joined with Emp ID : " + org[count].getDeptid());
						count++;
					} else
						System.out.println("Organisation is full, Can't Hire Anymore");
					break;

				case 2:
					if (count < num) {
						System.out.println("Enter the Worker Details : ");
						System.out.println("Enter First Name : ");
						String firstname = sc.next();
						System.out.println("Enter the last name :");
						String lastname = sc.next();
						System.out.println("Enter the basic salary :");
						double bsal = sc.nextDouble();
						System.out.println("Enter the Hours Worked : ");
						double hw = sc.nextDouble();
						System.out.println("Enter the Hourly Rate : ");
						double hr = sc.nextDouble();
						org[count] = new Worker(firstname, lastname, bsal, hw, hr);
						System.out.println("Employee Joined with Emp ID : " + org[count].getDeptid());
						count++;
					} else
						System.out.println("Organisation is full, Can't Hire Anymore");
					break;

				case 3:
					for (int i = 0; i < count; i++) {
						System.out.println(org[i]);
					}
					
					break;
				case 4:
						System.out.println("Enter the ID : ");
						int id = sc.nextInt();
						try {
							idValidate.employeeIdValidate(count,id,org);
							System.out.println("Enter the increment : ");
							double sal = sc.nextDouble();
							org[id-1001].updateBasic(sal);
						}
						catch (Exception e) {
							System.out.println(e.getMessage());
							e.printStackTrace();
							
						}
//						idValidate.employeeIdValidate(org);
//						boolean flag = true;
//						for (int i = 0; i < count; i++) {
//									flag = true;
//								if (org[i].getDeptid() == id) {
//									System.out.println("Enter the updated basic salary : ");
//									org[i].setBasic(sc.nextDouble());
//									flag = false;
//									break;
//							}
//							}
//							if (flag) {
//								System.out.println("No such emp found in Organisation");
//							}					
					break;
					
				case 5:
					System.out.println("Enter First Name : ");
					String first = sc.next();
					System.out.println("Enter Last Name : ");
					String last = sc.next();
					boolean flag1=true;
					for(int i=0;i<count;i++) {
						if(org[i].getFirstname().equals(first) && org[i].getLastname().equals(last)) {
							flag1=false;
							System.out.println("Employee is present in the organisation with [ Emp ID : "+org[i].getDeptid()+" ]");
						}
					}
					if(flag1) {
						System.out.println("No Employee is present in the organisation with such name :( ");
					}
					
					break;
					
				case 6:
					System.out.println("Enter First Name : ");
					String fnm = sc.next();
					System.out.println("Enter Last Name : ");
					String lnm = sc.next();
					try {
					if(idValidate.employeeNameValidate(org,fnm,lnm)) {
						
					}
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					break;
				}

			} while (choice != 10);
		}
	}
}
