package com.kevin.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.kevin.languages.models.Language;
import com.kevin.languages.services.LanguageService;

@Controller
public class homeController {
	private final LanguageService lService;
	public homeController (LanguageService service) {
		this.lService = service;
		}
	

	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguages", this.lService.allLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLanguages", this.lService.allLanguages());
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
}
	
	@GetMapping("/langdetails/{id}")
	public String langDetails(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thislang", this.lService.findLanguage(id));
		return "langdetails.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editLanguage(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language", this.lService.findLanguage(id));
		return "edit.jsp";
	}

	@PutMapping("/edit/{id}")
	public String updateLang(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			model.addAttribute("language", this.lService.findLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(language);
		return "redirect:/langdetails/{id}";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
}
