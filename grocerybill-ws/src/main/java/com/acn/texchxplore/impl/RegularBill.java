package com.acn.texchxplore.impl;

import com.acn.texchxplore.domain.GroceryBill;
import com.acn.texchxplore.entity.Item;
import com.acn.texchxplore.entity.ShoppingClerk;

public class RegularBill extends GroceryBill {

	public RegularBill() {
	}

	public RegularBill(ShoppingClerk clerk) {
		super(clerk);

	}

	@Override
	public double getTotalBill() {

		double total = 0;

		for (Item item : itemList) {
			total += item.getPrice();
		}

		return total;

	}

}
