package com.acn.texchxplore.domain;

import java.util.ArrayList;
import java.util.List;

import com.acn.texchxplore.entity.Item;
import com.acn.texchxplore.entity.ShoppingClerk;

public abstract class GroceryBill {

	protected List<Item> itemList = new ArrayList<Item>();
	private ShoppingClerk clerk;

	public GroceryBill() {

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

	public abstract double getTotalBill();
}
