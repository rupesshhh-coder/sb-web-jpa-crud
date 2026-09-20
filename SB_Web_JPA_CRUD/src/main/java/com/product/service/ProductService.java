package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	public void saveProduct(Product p);

	public void updateProduct(int i, float cost);

	public void deleteProductById(int id);

	public Product viewProductById(int id);

	public List<Product> viewAllProduct();

}
