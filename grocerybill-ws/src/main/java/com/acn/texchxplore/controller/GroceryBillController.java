package com.acn.texchxplore.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.acn.texchxplore.domain.GroceryBill;
import com.acn.texchxplore.entity.ShoppingClerk;
import com.acn.texchxplore.impl.DiscountedBill;
import com.acn.texchxplore.repository.ItemRepository;


public class GroceryBillController {

	public GroceryBillController() {
		shoppingClerk = new ShoppingClerk("TechXplore");
	}

	@Autowired
	private ItemRepository itemRepo;

	private ShoppingClerk shoppingClerk;




	public GroceryBill getTotalDiscountedBill() {

		GroceryBill grocery = new DiscountedBill(shoppingClerk);
		grocery.setItemList(itemRepo.findAll());

		return grocery;

	}
}
