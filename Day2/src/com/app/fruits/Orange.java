package com.app.fruits;

public class Orange extends Fruit{
	String taste = "sour";
	public String taste() {
		return taste;
	}
	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	public void juice() {
		System.out.println("Name :"+this.getName()+" | Color : "+this.getColor()+" | Msg: extracting juice!");
	}
	public String toString() {
		return super.toString()+" taste : "+this.taste;
	}
}
