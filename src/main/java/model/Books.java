package model;

import org.springframework.web.multipart.MultipartFile;

public class Books {
	
	private Long regNum; 
	private Long isbn;
	private String bookName;
	private String writer;
	private String publisher;
	private Long bookPrice;
	private MultipartFile imageFile;
	private String realFileName;
	private String bookIntroduction;
	
	public Long getRegNum() {
		return regNum;
	}
	public void setRegNum(Long regNum) {
		this.regNum = regNum;
	}
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Long getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public String getRealFileName() {
		return realFileName;
	}
	public void setRealFileName(String realFileName) {
		this.realFileName = realFileName;
	}
	public String getBookIntroduction() {
		return bookIntroduction;
	}
	public void setBookIntroduction(String bookIntroduction) {
		this.bookIntroduction = bookIntroduction;
	}
	

}
