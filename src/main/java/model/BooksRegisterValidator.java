package model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class BooksRegisterValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Books.class.isAssignableFrom(arg0);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "bookName", "required","필수 항목");
		ValidationUtils.rejectIfEmpty(errors, "writer", "required","필수 항목");
		ValidationUtils.rejectIfEmpty(errors, "publisher", "required","필수 항목");
		ValidationUtils.rejectIfEmpty(errors, "bookIntroduction", "required","필수 항목");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookPrice", "required","필수 항목");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "isbn", "required","필수 항목");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "realFileName", "required","필수 항목");
		
		Books books = (Books)target;
	}
}
