package com.codingdojo.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.loginregistration.models.LoginUser;
import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.services.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String main(@ModelAttribute("newUser") User user,
			@ModelAttribute("newLogin")LoginUser loginUser) {
		return "main.jsp";
	}
	
// ********************Register A User**************************
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("newUser") User user,BindingResult result,
			@ModelAttribute("newLogin")LoginUser loginUser,
			HttpSession session ) {
		
//Validate User
		userService.validate(user, result);
		if (result.hasErrors()) {
			return "main.jsp";
		}
		
//Register User
		userService.registerUser(user);
		
//Put User in Session
		session.setAttribute("loggedInUser", user);
		return "redirect:/dashboard";
		
	}
	
// ************************Login**************************
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser loginUser,
			BindingResult result,
			HttpSession session,
			@ModelAttribute("newUser") User user){
		
		//Authenticate User
		userService.authenticateUser(loginUser, result);
		if (result.hasErrors()) {
			return "main.jsp";
		}
		//Put User in Session
		User loggedInUser= userService.findByEmail(loginUser.getEmail());
		session.setAttribute("loggedInUser", loggedInUser);
		return "redirect:/dashboard";
	}

	// ************************Logout**************************
	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session){
		
		//Check if user is in session
		if(session.getAttribute("loggedInUser")!=null){
			return "dashboard.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	
	
	
	
}

