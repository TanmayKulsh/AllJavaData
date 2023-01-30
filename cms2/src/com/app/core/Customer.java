package com.app.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Customer implements Comparable<Customer> {

	//state 
	private int customerId;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private ServicePlan plan;
	
	//static
	public static int idGenerator;
	public static SimpleDateFormat sdf;
	
	
	//static init block
	static {
		idGenerator=1;
		sdf = new SimpleDateFormat("dd-MM-yyyy");	
	}
	
	//ctor with all args
	public Customer(String name, String email, String password, double regAmount, Date dob, ServicePlan plan) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
		this.customerId=idGenerator++;
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

	// 1 arg ctor : to init email
	public Customer(String email) {
		super();
		this.email = email;
	}
	
	public Customer(String email, String password) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.password=password;
	}

	//toString
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", regAmount=" + regAmount
				+ ", dob=" + sdf.format(dob) + ", plan=" + plan + "]"+password;
	}
	
	//equals
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customers equals");
		if(o instanceof Customer)
		{
			Customer c= (Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}
	
	//Natural Ordering
	@Override
	public int compareTo(Customer anotherCustomer) {
		// TODO Auto-generated method stub
		return this.email.compareTo(anotherCustomer.email);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
