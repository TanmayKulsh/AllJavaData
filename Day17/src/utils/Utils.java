package utils;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static enums.AccType.*;

import com.app.Bank;
public class Utils {

	//populating the list
	List<Bank> list  = new ArrayList<Bank>();
	Bank b1 = new Bank("Tanmay", "Kulshrestha", "tanmaykuls@gmail.com", "Tnmaykuls", 96492111, 1000, SAVINGS,LocalDate.parse("2022-11-23")); 
	Bank b2 = new Bank("Utkarsh", "Upadhayay", "utk@gmail.com", "UtkUpay", 38475345, 1000, FD,LocalDate.parse("2022-11-13")); 
	Bank b3 = new Bank("Yash", "Gujarthi", "yash@gmail.com", "YashGuj", 345345345, 1000, DMAT,LocalDate.parse("2022-11-24")); 
	Bank b4 = new Bank("Abhinav", "Pandey", "abhi@gmail.com", "AbhiNav", 345345345, 1000, SAVINGS,LocalDate.parse("2022-01-23")); 
	Bank b5 = new Bank("Nikhil", "Solankhi", "nik@gmail.com", "NikSol", 56858678, 1000, SAVINGS,LocalDate.parse("2022-10-12")); 
	
	
}
