package com.cdac.geometry;
import java.lang.Math;

public class Point2D {
	private int x, y;
	public Point2D() {
		
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void sety(int y) {
		this.y =y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String show() {
		return "x= " + x + " and y= " + y;
	}

	public boolean isEqual(Point2D p) {
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
	}

	public void calculateDistance(Point2D p) {
		double dis = Math.sqrt(Math.pow((p.x-this.x),2) + Math.pow((p.y-this.y),2));
	
		System.out.println(dis);
	}
}
