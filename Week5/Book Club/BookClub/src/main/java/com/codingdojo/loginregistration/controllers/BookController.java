package com.codingdojo.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.loginregistration.models.Book;
import com.codingdojo.loginregistration.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	// Logged in menu
	@GetMapping("/books")
	public String books(HttpSession session, Model model) {
		// check if user is in session
		if (session.getAttribute("loggedInUser") != null) {
			model.addAttribute("books", bookService.getAllBooks());
			return "books.jsp";
		} else {

			return "redirect:/";
		}

	}

	// Display book create form
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("newBook") Book newBook, HttpSession session) {
		if (session.getAttribute("loggedInUser") != null) {
			return "newbook.jsp";
		} else {
			return "redirect:/";
		}

	}

	// Create book
	@PostMapping("/createBook")
	public String createBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result,
			HttpSession session) {
		if (session.getAttribute("loggedInUser") == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "createBook.jsp";
		} else {
			bookService.addBook(newBook);
			return "redirect:/books";
		}
	}

	// Display Book Information
	@GetMapping("/book/{id}")
	public String showBook(@PathVariable Long id, Model model, HttpSession session) {
		if (session.getAttribute("loggedInUser") != null) {
			Book book = bookService.displayDetails(id);
			model.addAttribute("bookDetail", book);
			return "bookinfo.jsp";
		} else {
			return "redirect:/";
		}
	}

	
	//UPDATE
	// Display Edit Book form
	@GetMapping("/bookUpdate/{id}")
	public String editPage(@PathVariable Long id, @ModelAttribute("editBook") Book book,
			HttpSession session,
			Model model) {
		if (session.getAttribute("loggedInUser") != null) {
			Book bookForm=bookService.displayDetails(id);
			model.addAttribute("displayBook", bookForm);
			return "editbook.jsp";
		} else {
			return "redirect:/";
		}
	}
	
	
	
	//Edit Book
	@PutMapping("/editBook/{id}")
	public String editBook(@Valid @ModelAttribute("editBook")Book book,
			BindingResult result,
			HttpSession session) {
		if(session.getAttribute("loggedInUser")==null) {
			return "redirect:/";
		}
		else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
		
	}

}
