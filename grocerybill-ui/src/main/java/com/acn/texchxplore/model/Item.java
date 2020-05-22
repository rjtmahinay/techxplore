package com.acn.texchxplore.model;

public class Item {

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", isDiscounted=" + isDiscounted
				+ ", discountPercentage=" + discountPercentage + "]";
	}

	private Long id;
	private String name;

	private double price;

	private boolean isDiscounted;

	private double discountPercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item() {

	}

	public Item(String name, double price, boolean isDiscounted, double discountPercentage) {

		this.name = name;
		this.price = price;
		this.isDiscounted = isDiscounted;
		this.discountPercentage = discountPercentage;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public double getPrice() {
		return price;

	}

	public void setPrice(double price) {
		this.price = price;

	}

	public boolean isDiscounted() {
		return isDiscounted;

	}

	public void setDiscounted(boolean isDiscounted) {
		this.isDiscounted = isDiscounted;

	}

	public double getDiscountPercentage() {
		return discountPercentage;

	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;

	}
}
