package com.app.org;

public class Worker extends Emp{

	private double hoursWorked;
	private double hourlyRate;
		public Worker(String firstname, String lastname, double basic,double hoursWorked,double hourlyRate) {
		super(firstname, lastname, basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	public double netSal() {
		// TODO Auto-generated method stub
		return (this.getBasic()+(this.hoursWorked*this.hourlyRate));
	}	
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return super.toString()+this.netSal()+" ) | (  Hourly Rate : "+this.getHourlyRate()+" Hourls Worked : "+this.getHoursWorked();
	}
	
}
	