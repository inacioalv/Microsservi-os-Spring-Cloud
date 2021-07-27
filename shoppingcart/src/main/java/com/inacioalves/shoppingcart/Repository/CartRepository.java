package com.inacioalves.shoppingcart.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inacioalves.shoppingcart.Model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart,Integer> {

}
