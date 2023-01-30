package tester;
import com.app.org.*;
import java.util.Scanner;
public class Organization {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in);){
			
			System.out.println("Enter Number of employees you want to add to Organizations");
			Employee [] list = new Employee [sc.nextInt()] ;
			int counter = 0;
			boolean exit = false;
			boolean exit1 = false;
			while (!exit) {
				System.out.println("\nOptions \n\n1.Hire an employee\n2.Display all employees \n4.Update Basic salary of an employee \n0.Exit");
				switch(sc.nextInt()) {
				default :
					System.out.println("Oops wrong option");
					break;
				case 0:
					exit = true;
					break;
				case 1: 
						do {
						System.out.println("\nOption \n\n1.Hire manager\n2.Hire worker\n0.Exit");
						switch(sc.nextInt()) {
						case 0:
							exit1 = true;
							break;
						case 1 :
							if(counter<list.length) {
							System.out.println("Enter first name , last name , department id , basic salary , performance bonus of manager");
							list[counter] = new Manager (sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
							counter++;
							}
							else 
								System.out.println("Sorry,no more vacancy in organization");
							break;
						case 2 : 
							if(counter<list.length) {
								System.out.println("Enter first name , last name , department id , basic salary , hours worked , hourly rate of a worker");
								list[counter] = new Worker (sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
								counter++;
								}
								else 
									System.out.println("Sorry,no more vacancy in organization");
								break;
						default :
							System.out.println("Oops wrong option");
							break;
							
											}//inner switch
							}while(!exit1);//end of last while
						break;
				case 2:
					System.out.println("Showing all the employee details from Organization");
					for (Employee e : list) {
						if(e != null)
							System.out.println("\n"+e+"\nNet salary :"+e.netSalary());
					}
					break;
					
				case 3:
					System.out.println("Enter emp id ");
					int index = sc.nextInt();
					index-=1;
					if (index < list.length && index >= 0 && list[index] != null)
						{
						System.out.println("Enter increment amount");
						list [index].setBasic(sc.nextDouble());
						System.out.println("Basic salary set successfully");
						}
					else
					{
						System.out.println("Employee not found");
					}
					break;
				
				}//end switch
			}//end while 
		}//try block
	}//end main 
}


