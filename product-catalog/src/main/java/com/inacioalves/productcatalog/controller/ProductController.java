package com.inacioalves.productcatalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.productcatalog.Model.Product;
import com.inacioalves.productcatalog.Repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Product create(Product product) {
		return productRepository.save(product);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Product> Lista(){
		return (List<Product>) productRepository.findAll();
	}

	@RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
	public Optional<Product> finfById(@PathVariable Integer id){
		return productRepository.findById(id);
	}
	
}
