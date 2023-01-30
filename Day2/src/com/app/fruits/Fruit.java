package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh=true;
	
	public Fruit() {
		
	}
	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setFresh(boolean x) {
		this.fresh=x;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return fresh;
	}
	//public String toString() {
		//return "(Name: "+getName()+" )|(Color: "+getColor()+") | (weight in kgs: "+getWeight()+") | Freshness Status : "+(this.isFresh()?"fresh":"not fresh");
	//}
	public String taste() {
		return "No specific taste";
	}
}
