package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService ps;

	public void setPs(ProductService ps) {
		this.ps = ps;
	}

	@PostMapping
	public String saveProductRoute(@RequestBody Product p) {
		ps.saveProduct(p);
		return "Inserted";

	}

	@PutMapping("/{id}/{cost}")
	public String updateProductRoute(@PathVariable int id, @PathVariable float cost) {
		ps.updateProduct(id, cost);
		return "Updated";

	}

	@DeleteMapping("/{id}")
	public String DeleteProductRoute(@PathVariable int id) {
		ps.deleteProductById(id);
		return "Deleted";

	}

	@GetMapping("/{id}")
	public Product viewProductRoute(@PathVariable int id) {
		return ps.viewProductById(id);

	}

	@GetMapping
	public List<Product> viewAllProductRoute() {
		return ps.viewAllProduct();
	}

}
