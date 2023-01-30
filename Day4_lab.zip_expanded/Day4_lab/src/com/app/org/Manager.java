package com.app.org;

public class Manager extends Employee {
	private double perfBonus;
	public Manager (String firstName, String lastName,int deptId, double basic ,double perfBonus) {
		super(firstName,lastName,deptId,basic);
		this.perfBonus=perfBonus;
	}
	@Override 
	public String toString() {
		return super.toString()+"\nPerformance bonus "+perfBonus;
	}
	public double getPerfBonus () {
		return this.perfBonus;
	}
	@Override
	public double netSalary() {
		return this.getBasic()+perfBonus;
	}
	
}
