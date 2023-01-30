package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import static com.util.DBUtil.getCon;

import java.sql.CallableStatement;
import com.pojo.Account;
import com.util.DBUtil;

public class BankDALimpl implements BankDAL{
	
	
	private Connection con;
	private Statement stmt;
	private ResultSet rset;
	private PreparedStatement pstmt1,pstmt2,pstmt3,pstmt4;
	private java.sql.CallableStatement cstmt1;
	
	public BankDALimpl() throws SQLException 
	{
		con = DBUtil.getCon();	
		stmt = con.createStatement();
		pstmt1 = con.prepareStatement("insert into accounts values(?,?,?,?)");
		pstmt3 = con.prepareStatement("delete from accounts where accno = ?");
		pstmt4=con.prepareStatement("update accounts set fname = ?,lname = ?,balance = ? where accno = ?");
		cstmt1 = con.prepareCall("{call transfer_funds(?,?,?,?,?)}"); 
		
		cstmt1.registerOutParameter(4, Types.DOUBLE);
		cstmt1.registerOutParameter(5, Types.DOUBLE);
//				cstmt=con.prepareCall("{call transfer_funds(?,?,?,?,?)}"); 
//		//out parameter
//		
//		cstmt.registerOutParameter(4, Types.DOUBLE);//parameter 4 data type is double JVM send this info to DB
//		cstmt.registerOutParameter(5, Types.DOUBLE);//parameter 5

	}

	@Override
	public List<Account> getAllAccounts() {
	List<Account> allacts = new ArrayList<Account>();
	
	try {
		rset = stmt.executeQuery("select * from accounts");
		while (rset.next()) {
			allacts.add(new Account(rset.getInt("accno"),
					rset.getString("fname"),
					rset.getString(3),
					rset.getDouble(4)));
		}
		return allacts;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

	@Override
	public int addAccount(Account acc) throws SQLException {
		pstmt1.setInt(1,acc.getAccno());
		pstmt1.setString(2,acc.getFname());
		pstmt1.setString(3, acc.getLname());
		pstmt1.setDouble(4, acc.getBalance());
		
		int i = pstmt1.executeUpdate();
		return i;
	}

	@Override
	public int updateAccout(Account acc) throws SQLException {
		// TODO Auto-generated method stub
		pstmt4.setInt(4,acc.getAccno());
		pstmt4.setString(1,acc.getFname());
		pstmt4.setString(2, acc.getLname());
		pstmt4.setDouble(3, acc.getBalance());
		int i = pstmt4.executeUpdate();
		return i;
	}

	@Override
	public int deleteAccount(int id) throws SQLException {
		pstmt3.setInt(1,id);
		int i = pstmt3.executeUpdate();
		return i;
	}

	@Override

	public String moneyTransfer(int sId, int rId, double amount) throws SQLException {

		cstmt1.setInt(1, sId);//1st IN parameter
		cstmt1.setInt(2, rId);//2nd IN parameter
		cstmt1.setDouble(3, amount);//3rd IN parameter
		//execute Stored Procedure
		
		cstmt1.execute();		
		return  "Money Transfer : Sender Balance="+cstmt1.getDouble(4)+"   Reciver Balance:"+cstmt1.getDouble(5);
	}
}
