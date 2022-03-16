package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Books;
import model.BooksDaoImpl;
import model.RegisterBooks;

@Controller
public class DetailController {

	private BooksDaoImpl booksDaoImpl;
	
	public void setBooksDaoImpl(BooksDaoImpl booksDaoImpl) {
		this.booksDaoImpl = booksDaoImpl;
	}

	@RequestMapping("/detail/{num}")
	public String detail(@PathVariable("num") Long num, Model model ) {
		RegisterBooks books = booksDaoImpl.selectByNum(num);
		model.addAttribute("books", books);
		return "book_detail";
	}
}
