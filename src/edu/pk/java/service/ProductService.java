package edu.pk.java.service;

import edu.pk.java.model.Product;

public class ProductService {
	/**
	 * This method prints details of a product
	 */
	public void displayProduct(Product p) {
		System.out.println("Product Details ::");
		//System.out.println(p + ", " + p.na);
	}

	public double calcTotalPrice(Product[] products) {
		// [Product{id, name,price},Product{id,name,price}, Product{}...]
		int i = 0;
		while (i < products.length) {
			i++;
		}
		return 0;
	}
}

// Product Details ::101, Test