package com.app.fruits;

public class Mango extends Fruit{
	private String taste = "sween n sour";
	private String Spf = "pulp";
	
	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	public String taste() {
		return taste;
	}
	public void pulp() {
		System.out.println("Name :"+this.getName()+" | Color : "+this.getColor()+" | Msg: Creating pulp!");
	}
	public String toString() {
		return super.toString()+" taste : "+this.taste+" special Functionality : "+Spf;
	}
}
