package com.inacioalves.shoppingcart.Model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Item")
public class Item {

	private Integer productId;
	private Integer amount;
	
	public Item() {}
	
	public Item(Integer productId, Integer amount) {
		super();
		this.productId = productId;
		this.amount = amount;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
