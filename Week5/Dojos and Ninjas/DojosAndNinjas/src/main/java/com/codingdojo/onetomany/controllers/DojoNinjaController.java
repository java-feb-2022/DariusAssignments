package com.codingdojo.onetomany.controllers;

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

import com.codingdojo.onetomany.models.Dojo;
import com.codingdojo.onetomany.models.Ninja;
import com.codingdojo.onetomany.services.NinjaService;

@Controller
public class DojoNinjaController {
	@Autowired
	private NinjaService ninjaService;

	@GetMapping("/")
	private String home(Model model) {
		model.addAttribute("allDojos", ninjaService.getAllDojos());
		return "main.jsp";
	}

	@GetMapping("/dojo")
	public String dojo(@ModelAttribute("newDojo") Dojo dojo) {
		return "createDojo.jsp";
	}

	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "createDojo.jsp";
		}
		else {
			ninjaService.createDojo(dojo);
			return "redirect:/";
		}
	}

	@GetMapping("/ninja")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("dojos", ninjaService.getAllDojos());
		return "createNinja.jsp";
	}

	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "createNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String displayNinjas(@PathVariable Long id, Model model) {
		Dojo dojo = ninjaService.dojoDetail(id);
		List<Ninja> ninjas = dojo.getNinjas();
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjas);
		return "displayNinjas.jsp";
	}
	
	
	
}
