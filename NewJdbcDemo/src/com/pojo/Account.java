package com.pojo;

public class Account {

	private int accno;
	private String fname;
	private String lname;
	private double balance;
	public Account() {
		super();
	}
	public Account(int accno, String fname, String lname, double balance) {
		super();
		this.accno = accno;
		this.fname = fname;
		this.lname = lname;
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", fname=" + fname + ", lname=" + lname + ", balance=" + balance + "]";
	}
}
