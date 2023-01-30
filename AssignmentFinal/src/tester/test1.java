package tester;

import static utils.IOUtils2.readFiles2;

import java.util.List;
import static utils.IOUtils2.storePassBook;

import com.app.Passbook;

public class test1 {

	public static void main(String[] args) {
		
		try {
		List<Passbook> list = readFiles2("jan22.txt");
		
		System.out.println("A) Sum of all depopsits : ");
		double sum = list.stream()
				//sum of getdepositamunt will be done
				.mapToDouble(p -> p.getDepositAmount())   //maptodouble for making values into double
				.sum();
		System.out.println(sum);
		
		System.out.println("B) max deposit amount : ");
		double max = list.stream()
				.mapToDouble(p -> p.getDepositAmount())
				.max().orElseThrow();   //should write orelsethrow for min and max
		System.out.println(max);
		
		System.out.println("C) Shopping expenses (sum of withdrawals for shopping)"); 
		double sumW = list.stream()
				//filter to get specific values
				.filter(p -> p.getNarration().equalsIgnoreCase("Shopping"))
				.mapToDouble(p -> p.getWithdrawlAmount())
				.sum();
		System.out.println(sumW);
		
		System.out.println("D) Date on which maximum amount withdrawn");
		double amax = list.stream()
				.mapToDouble(p -> p.getWithdrawlAmount())
				.max().orElseThrow();
		
		list.stream()
				.filter(p -> p.getDepositAmount() == amax)
				.forEach(p -> System.out.println("Highest transaction was made on " + p.getTransactionDate()));
		
storePassBook(list, "hello");		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
