package com.tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dal.BankDALimpl;
import com.pojo.Account;
import static com.util.DBUtil.openConnection;;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		try {
			openConnection();
			BankDALimpl bank = new BankDALimpl();
				
		int choice = 0;
		
		do {
			System.out.println("Enter suitable choice: ");
			System.out.println("1- Get all Accounts");
			System.out.println("2- Add");
			System.out.println("3- Update");
			System.out.println("4- Delete");
			System.out.println("5- Transfer");
			System.out.println("10- exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				List <Account> acts = bank.getAllAccounts();
				acts.forEach((a) -> System.out.println(a));
				break;
				
				
			case 2:
				System.out.println("Enter accno,first name,Lastname,Balance");
				int i = bank.addAccount(new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble()));
				System.out.println("number of rows updated: "+i);
				break;
				
			case 3:
System.out.println("Enter the account number to be deleted");
				
				int iddd = sc.nextInt();
				List<Account> listt =bank.getAllAccounts();
//				list.stream()
//				.filter(p -> p.getAccno() == idd)
//				.forEach(p -> System.out.println(p));
				
				int numm = listt.stream()
						.filter(p -> p.getAccno() == iddd)
						.mapToInt(p -> p.getAccno())
						.sum();			
//				System.out.println("number of rows updated: "+j);
				if(numm<1) {
					System.out.println("Entered Accno is not found in Bank Database");
				}
				else {
				System.out.println("Enter the updated Details: First name,last name,amount");
					int jjj = bank.updateAccout(new Account(iddd,sc.next(),sc.next(),sc.nextDouble()));
					System.out.println("number of rows updated: "+jjj);	
				}				
				
				break;
				
			case 4:
				System.out.println("Enter the account number to be deleted");
				
				int idd = sc.nextInt();
				List<Account> list =bank.getAllAccounts();
//				
				int num = list.stream()
						.filter(p -> p.getAccno() == idd)
						.mapToInt(p -> p.getAccno())
						.sum();
				
				
				if(num<1) {
					System.out.println("Entered Accno is not found in Bank Database");
				}
				else {
					int j = bank.deleteAccount(idd);
					System.out.println("number of rows updated: "+j);	
				}
				break;
				
			case 5: 
				System.out.println("Enter the sender's accno:,reciver's accno and ammount");
			System.out.println(bank.moneyTransfer(sc.nextInt(), sc.nextInt(),sc.nextDouble()));
				break;
			}
		}while(choice  != 10);
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
