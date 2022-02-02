package com.kevin.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kevin.dojooverflow.models.Answer;
import com.kevin.dojooverflow.models.Question;
import com.kevin.dojooverflow.services.doService;
import com.kevin.dojooverflow.validators.TagValidator;

@Controller
public class HomeController {
	@Autowired
	private doService doService;
	@Autowired
	private TagValidator validator;
	
	
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("allquestions", this.doService.getAllQuestions());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "new.jsp";
		}
	
	@PostMapping("/newQuestion")
	public String createQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.doService.createQuestion(question);
		return "redirect:/";
	}

	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model, @ModelAttribute("answer") Answer answer) {
		model.addAttribute("question", this.doService.findOneQuestion(id));
		return "show.jsp";
	}
	
	@PostMapping("/newAnswer")
	public String createAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("question", this.doService.findOneQuestion(answer.getQuest().getId()));
			return "show.jsp";
		}
		this.doService.createAnswer(answer);
		return "redirect:/show/" + answer.getQuest().getId();
		
	}
}