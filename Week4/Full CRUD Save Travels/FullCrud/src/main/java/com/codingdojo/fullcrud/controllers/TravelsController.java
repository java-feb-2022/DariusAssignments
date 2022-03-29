package com.codingdojo.fullcrud.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.fullcrud.models.Travel;
import com.codingdojo.fullcrud.services.TravelService;

@Controller
public class TravelsController {
	@Autowired
	private TravelService travelService;

	
	@GetMapping("/")
	public String expenses(Model models, @ModelAttribute("travel") Travel travel) {
		models.addAttribute("travels", travelService.getAllTravels());
		return "expenses.jsp";
	}

	
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
		if (result.hasErrors()) {
			return "expenses.jsp";
		} 
		else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}
	
	
	@GetMapping("/update/{id}")
	public String edit(@PathVariable Long id, Model model) {
		Travel editTravel=travelService.travelDetail(id);
		model.addAttribute("editTravel",editTravel);
		return "edit.jsp";
	}

	
	@PutMapping("/update/{id}")
	public String update(@ModelAttribute("editTravel") Travel travel) {
		travelService.updateTravel(travel);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
	}
	
	@GetMapping("/detail/{id}")
	public String expenseDetail(@PathVariable Long id, Model model) {
		Travel displayDetail= travelService.travelDetail(id);
		model.addAttribute("displayDetail", displayDetail);
		return "display.jsp";
	}
	
}
