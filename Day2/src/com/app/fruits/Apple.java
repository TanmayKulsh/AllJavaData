package com.app.fruits;

public class Apple extends Fruit {
	String taste = "sweet and sour";

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	public String taste() {
		return taste;
	}
	public void jam() {
		System.out.println("Name :"+this.getName()+" | Color : "+this.getColor()+" | Msg: making jam!");
	}
	public String toString() {
		return super.toString()+" taste : "+this.taste;
	}
}
