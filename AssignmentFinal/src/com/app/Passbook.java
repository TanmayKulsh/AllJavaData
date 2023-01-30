package com.app;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passbook implements Serializable{

	private LocalDate transactionDate;
	private String narration;
	private double withdrawlAmount,depositAmount;
	public static DateTimeFormatter dt;
	static {
		//to convert into standard format for local date
		dt = DateTimeFormatter.ofPattern("dd-M-yyyy");
	}
	public Passbook(LocalDate transactionDate, String narration, double withdrawlAmount, double depositAmount) {
		super();
		this.transactionDate = transactionDate;
		this.narration = narration;
		this.withdrawlAmount = withdrawlAmount;
		this.depositAmount = depositAmount;
	}
	@Override
	public String toString() {
		return "pojo [transactionDate=" + transactionDate + ", narration=" + narration + ", withdrawlAmount="
				+ withdrawlAmount + ", depositAmount=" + depositAmount + "]";
	}
	public String getTransactionDate() {
		return dt.format(transactionDate);
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public double getWithdrawlAmount() {
		return withdrawlAmount;
	}
	public void setWithdrawlAmount(double withdrawlAmount) {
		this.withdrawlAmount = withdrawlAmount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
	
}
