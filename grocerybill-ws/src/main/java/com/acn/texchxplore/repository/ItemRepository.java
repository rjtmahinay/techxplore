package com.acn.texchxplore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acn.texchxplore.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
