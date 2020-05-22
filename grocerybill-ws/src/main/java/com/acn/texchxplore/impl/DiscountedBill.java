package com.acn.texchxplore.impl;

import com.acn.texchxplore.domain.GroceryBill;
import com.acn.texchxplore.entity.Item;
import com.acn.texchxplore.entity.ShoppingClerk;

public class DiscountedBill extends GroceryBill {
	
	public DiscountedBill() {
	}

	public DiscountedBill(ShoppingClerk clerk) {
		super(clerk);

	}


	@Override
	public double getTotalBill() {
		double total = 0;
		for (Item item : itemList) {
			if (item.isDiscounted()) {
				total += item.getPrice() - (item.getPrice() * (item.getDiscountPercentage() / 100));
			} else {
				total += item.getPrice();
				
			}

		}

		return total;

	}

}
