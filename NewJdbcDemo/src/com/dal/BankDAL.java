package com.dal;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Account;

public interface BankDAL {
	
	List<Account> getAllAccounts() throws SQLException;
	
	int addAccount(Account acc) throws SQLException;
	
	int updateAccout(Account acc) throws SQLException;
	
	int deleteAccount(int id) throws SQLException;
	
	String moneyTransfer(int sId,int rId,double amount) throws SQLException;
	
	
	

}
