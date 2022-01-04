package com.kevin.dojoSurvey.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeController {
	@GetMapping("/")
	public String index() {
		return "Index.jsp";
	}
	
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comments") String comments, Model viewModel) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language", language);
		viewModel.addAttribute("comments", comments);
		
		return "result.jsp";
	}

}
