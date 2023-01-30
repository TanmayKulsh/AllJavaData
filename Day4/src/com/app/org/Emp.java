package com.app.org;

public class Emp {

	private static int count = 1;
	private String firstname;
	private String lastname;
	private static int deptid;
	private double basic;

	static {
		count = 1001;
	}

	public static void setid(int id) {
		count = id;
	}

	public Emp() {

	}

	public Emp(String firstname, String lastname, double basic) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.basic = basic;
		this.deptid = count;
		count++;
	}
	public Emp (String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public void updateBasic(double inc) {
		this.basic = this.basic + inc;
		System.out.println("Updated Salary After Increment is : " + this.basic);
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public static int getDeptid() {
		return deptid;
	}

	public String toString() {
		return "( Id : " + this.deptid + " ) | (First Name : " + this.firstname + " ) | (Last name : " + this.lastname
				+ " ) | ( Netsal : ";
	}

	//public abstract double netSal();

	@Override
	public boolean equals(Object anotherEmployee) {
		if (anotherEmployee instanceof Emp)
			if (((Emp) anotherEmployee).getFirstname().equals(this.getFirstname())
					&& ((Emp) anotherEmployee).getLastname().equals(this.getLastname())) {
						return true;
			}
		return false;
	}
}
