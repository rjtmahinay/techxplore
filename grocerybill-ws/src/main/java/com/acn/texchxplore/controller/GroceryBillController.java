package com.acn.texchxplore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.texchxplore.domain.GroceryBill;
import com.acn.texchxplore.entity.ShoppingClerk;
import com.acn.texchxplore.impl.DiscountedBill;
import com.acn.texchxplore.impl.RegularBill;
import com.acn.texchxplore.repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class GroceryBillController {

	public GroceryBillController() {
		shoppingClerk = new ShoppingClerk("TechXplore");
	}

	@Autowired
	private ItemRepository itemRepo;

	private ShoppingClerk shoppingClerk;



	@RequestMapping("/bill/discounted")
	public GroceryBill getTotalDiscountedBill() {

		GroceryBill grocery = new DiscountedBill(shoppingClerk);
		
	    grocery.setItemList(itemRepo.findAll());

		return grocery;

	}
	
	@RequestMapping("/bill/regular")
	public GroceryBill getTotalRegularBill() {
		GroceryBill grocery = new RegularBill(shoppingClerk);
		
	    grocery.setItemList(itemRepo.findAll());
	    
	    return grocery;
	}
}
