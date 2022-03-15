package model;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class BooksRegisterService {

	private BooksDaoImpl booksDaoImpl;
	
	public BooksRegisterService() {
		
	}
	
	public BooksRegisterService(BooksDaoImpl booksDaoImpl) {
		System.out.println("BooksRegisterService(BooksDaoImpl)");
		this.booksDaoImpl = booksDaoImpl;
	}
	
	public void booksRegist(Books books, HttpServletRequest request) {
		Books newBooks = new Books();
		try {
		MultipartFile fileName = books.getImageFile();
		String realFileName = fileName.getOriginalFilename();
//		String storedFileName = UUID.randomUUID().toString().replaceAll("-", "");
		
		String folderPath = "upload";
		String realPath = request.getServletContext().getRealPath(folderPath);
		System.out.println("realPath : " + realPath);
//		File file = new File(realPath, realFileName);
		File file = new File(realPath);

		fileName.transferTo(new File(realPath, realFileName ));
		
		newBooks.setBookName(books.getBookName());
		newBooks.setWriter(books.getWriter());
		newBooks.setBookPrice(books.getBookPrice());
		newBooks.setBookIntroduction(books.getBookIntroduction());
		newBooks.setRealFileName(realFileName);
		newBooks.setIsbn(books.getIsbn());
		newBooks.setPublisher(books.getPublisher());
		
		booksDaoImpl.insert(newBooks);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
