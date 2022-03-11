package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Books;
import model.BooksDaoImpl;
import model.BooksSearchCommand;

@Controller
public class SearchController {
	
	private BooksDaoImpl booksDaoImpl;  

	
	public void setBooksDaoImpl(BooksDaoImpl booksDaoImpl) {
		this.booksDaoImpl = booksDaoImpl;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String listAll(BooksSearchCommand booksSearchCommand, Model model) {
		
		List<Books> booksList = (List)booksDaoImpl.selectByKeyword(booksSearchCommand);
		
		model.addAttribute("booksList", booksList);
		
		return "book_list";
	}
}
