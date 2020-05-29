package com.acn.texchxplore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.acn.texchxplore.model.GroceryBill;
import com.acn.texchxplore.model.Item;
import com.acn.texchxplore.model.ShoppingClerk;




@Controller
@RibbonClient(name = "webservice", configuration = GroceryConfiguration.class)
public class GroceryBillController {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/techxplore/grocery")
	public String getIndexPage(Model model) {
		
		GroceryBill regularBill = this.restTemplate.getForObject("http://localhost:9098/items/bill/regular", GroceryBill.class);
		GroceryBill discountedBill = this.restTemplate.getForObject("http://localhost:9098/items/bill/discounted", GroceryBill.class);
		
		ShoppingClerk clerk = new ShoppingClerk(regularBill.getClerk().getName());
		
		model.addAttribute("regularBill", regularBill);
		model.addAttribute("discountedBill", discountedBill);
		model.addAttribute("clerk", clerk);
		return "grocery";
	}

}
