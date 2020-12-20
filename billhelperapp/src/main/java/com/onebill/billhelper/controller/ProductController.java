
package com.onebill.billhelper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billhelper.dao.ProductRepository;
import com.onebill.billhelper.entity.Product;

@RequestMapping("company/product")
@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepo;

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		productRepo.save(product);
		return product;
	}

	@DeleteMapping
	public Product removeProduct(@RequestBody Product product) {
		 productRepo.delete(product);
		 return product;
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productRepo.save(product);

	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
}
