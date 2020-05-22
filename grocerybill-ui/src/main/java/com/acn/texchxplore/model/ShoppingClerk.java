package com.acn.texchxplore.model;


public class ShoppingClerk {




	public ShoppingClerk() {
	}

	public ShoppingClerk(String name) {
		this.name = name;

	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ShoppingClerk [name=" + name + "]";
	}

}
