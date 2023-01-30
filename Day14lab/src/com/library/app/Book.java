package com.library.app;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{   // here serieziable is a marker interface
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private String title;
	private Category bookCategory;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	
	//ctor
	public Book(String title, Category bookCategory, double price, LocalDate publishDate, String authorName,
			int quantity) {
		super();
		this.title = title;
		this.bookCategory = bookCategory;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookCategory=" + bookCategory + ", price=" + price + ", publishDate="
				+ publishDate + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	

}
