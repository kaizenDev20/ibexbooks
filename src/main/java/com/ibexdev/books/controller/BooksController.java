package com.ibexdev.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {

	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
}
