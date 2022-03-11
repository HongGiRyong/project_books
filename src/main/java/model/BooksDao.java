package model;

import java.util.Collection;

public interface BooksDao {
	
	public Collection<Books> listAll();
	public void insert(Books books);
	public Books selectByNum(Long num);
	public Collection<Books> selectByKeyword(BooksSearchCommand booksSearchCommand);	
}
