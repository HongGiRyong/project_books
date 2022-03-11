package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Books;
import model.BooksDaoImpl;

@Controller
public class ListController {
	
	private BooksDaoImpl booksDaoImpl;  
	
	public void setBooksDaoImpl(BooksDaoImpl booksDaoImpl) {
		this.booksDaoImpl = booksDaoImpl;
	}
	
	@RequestMapping("/list")
	public String listAll(Model model) {

		List<Books> booksList = (List)booksDaoImpl.listAll();
		
		model.addAttribute("booksList", booksList);
		
		return "book_list";
	}
}
