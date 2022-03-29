package com.codingdojo.loginregistration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.loginregistration.models.Book;
import com.codingdojo.loginregistration.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	
	//Display all books
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	//add a book
	public Book addBook(Book newBook) {
		return bookRepo.save(newBook);
	}
	
	//Find book by id
	public Book findById(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	//Display Details
	public Book displayDetails(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	//update book
	public Book updateBook(Book updatedBook) {
		return bookRepo.save(updatedBook);
	}
}
