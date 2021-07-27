package com.inacioalves.productcatalog.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "Product")
public class Product {
	
	@Id
	private Integer id;
	private String name;
	private Integer amout;
	
	public Product() {
	}
	
	public Product(Integer id, String name, Integer amout) {
		super();
		this.id = id;
		this.name = name;
		this.amout = amout;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmout() {
		return amout;
	}
	public void setAmout(Integer amout) {
		this.amout = amout;
	}

}
