package edu.pk.java.model;

public class Product {
	// var and method::> static / non-static

	private int id;
	private String name;
	private String type;
	private double price;
	private boolean isAvailable;

	private static int objectCount;

	public Product(int id, String name) {// formal arguments OR parameter
		this.id = id;
		this.name = name;
		objectCount++;
	}

	public static int getObjectCount() {
		return objectCount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
