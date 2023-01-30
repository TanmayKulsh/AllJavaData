package TestThread;
import java.util.Scanner;

import runnable_tasks.EvenPrinterTask;
import runnable_tasks.OddPrinterTask;

public class TestConcurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter range");
			int start=sc.nextInt();
			int end=sc.nextInt();
			Thread t1=new Thread(new EvenPrinterTask(start, end),"even");//new
			Thread t2=new Thread(new OddPrinterTask(start, end),"odd");//new
			t1.start();
			t2.start();//main ,even,odd
			System.out.println("main is waiting for child to complete the exec");
			t1.join();
			t2.join();
			System.out.println("main over");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
