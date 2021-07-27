package com.inacioalves.shoppingcart.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Cart")
public class Cart {
	
	@Id
	private Integer id;
	private List<Item> items;
	
	
	public Cart() {
	}

	public Cart(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItem() {
		if(items == null) {
			items = new ArrayList<>();
		}
		return items;
	}

	public void setItem(List<Item> items) {
		this.items = items;
	}
	
	
	
	

}
