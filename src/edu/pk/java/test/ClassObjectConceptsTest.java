package edu.pk.java.test;

import edu.pk.java.model.Product;

public class ClassObjectConceptsTest {
	public static void main(String[] args) {
		Product p = new Product(101, "Apple"); // no argument
		p.setPrice(500);
		p.setType("Food");

		Product p1 = new Product(102, "Jeans"); // no argument
		p1.setPrice(1500);
		p1.setType("Cloth");

		System.out.println(Product.getObjectCount());

		Product p2 = new Product(103, "Sweets"); // no argument
		p2.setPrice(1200);
		p2.setType("Food");

		System.out.println(Product.getObjectCount());
	}
}
