package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class Routes {
	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	@RequestMapping("/{action}/{place}")
	public String travel(@PathVariable("action") String action,@PathVariable("place")String place) {
		return "Congratulations! You will soon "+ action +" to "+ place;
	}
	@RequestMapping("/lotto/{luckyNumber}")
	public String getLucky(@PathVariable("luckyNumber") Integer luckyNumber) {
		if (luckyNumber == 6) {
			return "You will take a grand journey in the near future, be wary of the tempting offers.";
		}
		else if (luckyNumber == 37){
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		else if (luckyNumber == null){
			return "You didnt enter a lucky number";
		}
		else {
			return "Unfortunately NO fortune exists here";
		}
	}
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
		
}
