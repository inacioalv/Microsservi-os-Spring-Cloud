package com.inacioalves.shoppingcart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inacioalves.shoppingcart.Model.Cart;
import com.inacioalves.shoppingcart.Model.Item;
import com.inacioalves.shoppingcart.Repository.CartRepository;

@RestController
@RequestMapping(value = "/cart")
public class CartController {
	
	@Autowired
	private CartRepository CartRepository;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
		Optional<Cart> savedCart = CartRepository.findById(id);
		Cart Cart;
		if(savedCart.equals(Optional.empty())) {
			Cart = new Cart(id);
		}else {
			Cart= savedCart.get();
		}
		Cart.getItem().add(item);
		return CartRepository.save(Cart);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Cart> findAll(){
		return (List<Cart>) CartRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Cart> findById(@PathVariable("id") Integer id){
		return CartRepository.findById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void clear(@PathVariable("id") Integer id) {
		CartRepository.deleteById(id);
	}
	
	
}
