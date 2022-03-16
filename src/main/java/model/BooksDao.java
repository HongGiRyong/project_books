package model;

import java.util.Collection;

public interface BooksDao {
	
	public Collection<RegisterBooks> listAll();
	public void insert(RegisterBooks registerBooks);
	public RegisterBooks selectByNum(Long num);
	public Collection<RegisterBooks> selectByKeyword(BooksSearchCommand booksSearchCommand);	
}
