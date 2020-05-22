package com.acn.texchxplore.model;

import java.util.ArrayList;
import java.util.List;

public class GroceryBill {

	private List<Item> itemList = new ArrayList<Item>();
	private ShoppingClerk clerk;
	private double totalBill;

	public GroceryBill() {

	}

	public void setClerk(ShoppingClerk clerk) {
		this.clerk = clerk;
	}

	public GroceryBill(ShoppingClerk clerk) {
		this.clerk = clerk;

	}

	public ShoppingClerk getClerk() {
		return clerk;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public void addItem(Item item) {
		itemList.add(item);

	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "GroceryBill [itemList=" + itemList + ", clerk=" + clerk + ", getTotalBill=" + totalBill + "]";
	}

}
