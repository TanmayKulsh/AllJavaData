package com.app.org;

public class Worker extends Employee{
	private double hoursWorked;
	private double hourlyRate;
	public Worker (String firstName, String lastName,int deptId, double basic ,double hoursWorked,double hourlyRate) {
		super(firstName,lastName,deptId,basic);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double netSalary() {
		return this.getBasic()+(hoursWorked*hourlyRate);
	}
	public double getHourlyRate() {
		return this.hourlyRate;
	}
	@Override 
	public String toString() {
		return super.toString()+"\nHours worked " + hoursWorked+ "\nHourly rate : "+ hourlyRate;
	}

}
