package com.kevin.prodcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.prodcat.models.Category;
import com.kevin.prodcat.models.Product;
import com.kevin.prodcat.repositories.CategoryRepository;
import com.kevin.prodcat.repositories.ProductRepository;

@Service
public class ProdCatService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Category createCategory(Category category ) {
		return this.cRepo.save(category);
	}
	
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNoProd(Product product) {
		return this.cRepo.findByProductsNotContains(product);
}
	
	public List<Product> findProdNoCat(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
}
	
	public void addCategoryToProduct(Product product, Category category) {
		List<Category> currentCategories = product.getCategories();
		currentCategories.add(category);
		this.pRepo.save(product);
		}
	
	public void addProductToCategory(Product product, Category category) {
		List<Product> currentProducts = category.getProducts();
		currentProducts.add(product);
		this.cRepo.save(category);
		
	}
	}
	

