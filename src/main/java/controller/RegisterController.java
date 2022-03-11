package controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
		
		booksRegisterService.booksRegist(books,request);
		return "redirect:/list";
	}
	
}








