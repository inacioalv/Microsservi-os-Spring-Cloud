package com.inacioalves.productcatalog.Repository;

import org.springframework.data.repository.CrudRepository;

import com.inacioalves.productcatalog.Model.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
