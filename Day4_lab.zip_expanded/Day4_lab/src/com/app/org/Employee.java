package com.app.org;
public abstract class  Employee {
	private int empId,deptId;
	private String firstName,lastName;
	private double basic;
	private static int counter;
	static {
		 counter =1 ;
	}
	public Employee (String firstName, String lastName,int deptId, double basic) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.basic=basic;
		this.empId=counter++;
		this.deptId=deptId;
	}
	@Override
	public String toString () {
		return "\nID: "+empId +"\nFirst Name : "+firstName+"\nLast name : "+lastName+
				"\nBasic Salary : "+basic+"\nDepartment Id : "+deptId; 
	}
	public abstract double netSalary();
	public double getBasic() {
		return basic;
	}
	public void setBasic(double increment) {
		this.basic+=increment;
	}
	
}
