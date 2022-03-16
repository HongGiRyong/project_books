package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import model.Books;
import model.BooksRegisterService;
import model.BooksRegisterValidator;

@Controller
@RequestMapping("/add")
public class RegisterController {

	private BooksRegisterService booksRegisterService;
	private BooksRegisterValidator booksRegisterValidator;

	@RequestMapping(method=RequestMethod.GET)
	public String regForm(Books books) {
		
		return "/book_reg_form";
	}
	
	public void setBooksRegisterService(BooksRegisterService booksRegisterService) {
		
		this.booksRegisterService = booksRegisterService;
	}
	
	public void setBooksRegisterValidator(BooksRegisterValidator booksRegisterValidator) {
		
		this.booksRegisterValidator = booksRegisterValidator;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String regSuccess(Books books, Errors errors, HttpServletRequest request) {
		
		booksRegisterValidator.validate(books, errors);
		
		if(errors.hasErrors()) {

			return "/book_reg_form";
		}	
		
		booksRegisterService.booksRegist(books,request);
		return "redirect:/list";
	}


}









