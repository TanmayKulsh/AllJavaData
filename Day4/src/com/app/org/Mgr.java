package com.app.org;

public class Mgr extends Emp{

	double perfBonus;

	public Mgr(String firstname, String lastname, double basic,double perfBonus) {
		super(firstname,lastname,basic);
		this.perfBonus=perfBonus;
		}
	public String toString() {
		return super.toString()+" : "+this.netSal()+" )";
	}
	public double netSal() {
		return (this.perfBonus+this.getBasic());
	}
	public double getBonus() {
		return this.perfBonus;
	}
	
}
