package com.app;

import java.time.LocalDate;
import java.util.Objects;

import enums.AccType;

import enums.AccType;

public class Bank {
	private int accno;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double balance;
	private AccType acctype;
	private LocalDate dtopen;
	private long aadharno;
	private static int IdCount;

	static {
		IdCount = 1001;
	}

	public Bank(String fname, String lname, String email, String password, long aadharno, double balance,
			AccType acctype, LocalDate dtopen) {
		super();
		this.accno = IdCount;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.balance = balance;
		this.acctype = acctype;
		this.dtopen = dtopen;
		this.password = password;
		this.aadharno = aadharno;
		IdCount++;
	}

	@Override
	public String toString() {
		return "Bank [accno=" + accno + ",First name=" + fname + ", Last name=" + lname + ", email=" + email
				+ ", password=" + password + ", balance=" + balance + ", acctype=" + acctype + ", dtopen=" + dtopen
				+ ", aadharno=" + aadharno + "]";
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return (fname + lname);
	}

	public void setFname(String name) {
		this.fname = name;
	}

	public void setLname(String name) {
		this.lname = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccType getAcctype() {
		return acctype;
	}

	public void setAcctype(AccType acctype) {
		this.acctype = acctype;
	}

	public LocalDate getDtopen() {
		return dtopen;
	}

	public void setDtopen(LocalDate dtopen) {
		this.dtopen = dtopen;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public boolean equals(Object ano) {

		if (ano instanceof Bank) {
			Bank b = (Bank) ano;
			return this.getAccno() == b.getAccno();
		}
		return false;
	}

}
