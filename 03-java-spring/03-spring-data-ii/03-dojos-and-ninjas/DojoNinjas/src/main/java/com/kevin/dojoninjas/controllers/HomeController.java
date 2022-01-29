package com.kevin.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kevin.dojoninjas.models.Dojo;
import com.kevin.dojoninjas.models.Ninja;
import com.kevin.dojoninjas.services.dojoninjasService;



@Controller
public class HomeController {
	@Autowired
	private dojoninjasService dnService;
	
	@GetMapping("/")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		this.dnService.createDojo(dojo);
		return "redirect:/newNinja";
	}
	
	@GetMapping("/newNinja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = this.dnService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Dojo> allDojos = this.dnService.allDojos();
			model.addAttribute("allDojos", allDojos);
			return "newNinja.jsp";
		}
		this.dnService.createNinja(ninja);
		return "redirect:/showDojo/" + ninja.getDojo().getId();
	}
	
	@GetMapping("/showDojo/{id}") 
		public String showDojo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", this.dnService.getOneDojo(id));
	return "showDojo.jsp";
	}
	
	}
