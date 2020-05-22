package com.acn.texchxplore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.acn.texchxplore.entity.Item;
import com.acn.texchxplore.repository.ItemRepository;

@SpringBootApplication
public class GrocerybillWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrocerybillWsApplication.class, args);
	}
	
	@Bean 
	public CommandLineRunner loadData(ItemRepository itemRepository) {
		return (args) -> {
			
			List<Item> itemList = new ArrayList<Item>();

			Item item1 = new Item("Panteen Shampoo", 25.00, false, 0.00);
			Item item2 = new Item("Creamsilk Conditioner", 30.00, false, 0.00);
			Item item3 = new Item("Colgate Toothpaste", 100.00, true, 10.00);
			Item item4 = new Item("Safeguard Soap", 50.00, true, 20.00);
			Item item5 = new Item("Pond's Facial Wash", 75.00, false, 0.00);

			itemList.add(item1);
			itemList.add(item2);
			itemList.add(item3);
			itemList.add(item4);
			itemList.add(item5);

			itemRepository.saveAll(itemList);
			

		};
	}

}
