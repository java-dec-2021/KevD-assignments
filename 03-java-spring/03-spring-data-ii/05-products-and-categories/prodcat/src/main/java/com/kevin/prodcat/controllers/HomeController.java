package com.kevin.prodcat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kevin.prodcat.models.Category;
import com.kevin.prodcat.models.Product;
import com.kevin.prodcat.services.ProdCatService;



@Controller
public class HomeController {
	@Autowired
	private ProdCatService pcService;
	
	@GetMapping("/products/new")
	public String newProduct() {
		return "newProduct.jsp";
	}
	
	@GetMapping("/categories/new")
	public String newCategory() {
		return "newCategory.jsp";
	}
	
	@PostMapping("/newCategory")
	public String createCategory(@RequestParam("name") String name) {
		Category newCategory = new Category();
		newCategory.setName(name);
		this.pcService.createCategory(newCategory);
		return "redirect:/categories/new";
}
	
	@PostMapping("/newProduct")
	public String createProduct(@RequestParam("name") String name, @RequestParam("description") String description, @RequestParam("price") Double price) {
		Product newProduct = new Product();
		newProduct.setName(name);
		newProduct.setDescription(description);
		newProduct.setPrice(price);
		this.pcService.createProduct(newProduct);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id) {
		Product productToShow = this.pcService.getSingleProduct(id);
		model.addAttribute("notInProduct", this.pcService.findCatNoProd(productToShow));
		model.addAttribute("product", productToShow);
		return "showProduct.jsp";
}
 
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("categories") Long id, @PathVariable("id") Long productId) {
		Product productToAddCategory = this.pcService.getSingleProduct(productId);
		Category categoryToAdd = this.pcService.getSingleCategory(id);
		this.pcService.addCategoryToProduct(productToAddCategory, categoryToAdd);
		return "redirect:/{id}";
}
	
	@GetMapping("/category/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id) {
		Category categoryToShow = this.pcService.getSingleCategory(id);
		model.addAttribute("notInCategory", this.pcService.findProdNoCat(categoryToShow));
		model.addAttribute("category", categoryToShow);
		return "showCategory.jsp";
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdToCat(@RequestParam("products") Long id, @PathVariable("id") Long categoryId) {
		Product productToAddCategory = this.pcService.getSingleProduct(id);
		Category categoryToAdd = this.pcService.getSingleCategory(categoryId);
		this.pcService.addProductToCategory(productToAddCategory, categoryToAdd);
		return "redirect:/category/{id}";
}

	
}