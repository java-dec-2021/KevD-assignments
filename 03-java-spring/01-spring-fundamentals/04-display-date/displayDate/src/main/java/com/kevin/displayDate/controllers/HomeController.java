package com.kevin.displayDate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "Index.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "DateTime.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model viewModel) {
		viewModel.addAttribute("datetime", getDate());
		return "Time.jsp";
	}
	
	private Date getDate() {
		Date now = new Date();	
		return now;
	}
	
	
}
