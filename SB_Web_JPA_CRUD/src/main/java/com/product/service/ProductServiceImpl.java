package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	// -- inject repository setter
	@Autowired
	ProductRepository pr;

	public void setPr(ProductRepository pr) {
		this.pr = pr;
	}

	@Override
	public void saveProduct(Product p) {
		pr.save(p); // save() ---> JpaRepository

	}

	@Override
	public void updateProduct(int i, float cost) {
		Optional<Product> pp = pr.findById(i);
		Product p = pp.get();
		p.setCost(cost);
		pr.save(p);

	}

	@Override
	public void deleteProductById(int id) {
		pr.deleteById(id);

	}

	@Override
	public Product viewProductById(int id) {
		Product pp = pr.findById(id).get();

		return pp;
	}

	@Override
	public List<Product> viewAllProduct() {
		return pr.findAll();
	}

}
