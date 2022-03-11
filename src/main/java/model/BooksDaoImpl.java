package model;

import java.util.Collection;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class BooksDaoImpl implements BooksDao{
	
	private SqlSessionTemplate sqlSessionTemplate;

	public BooksDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public Collection<Books>  listAll() {
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public void insert(Books books) {
		sqlSessionTemplate.insert("insert", books);
	}
	
	@Override
	public Books selectByNum(Long num) {
		List<Books> results = sqlSessionTemplate.selectList("selectByNum", num);
		return results.isEmpty() ? null : results.get(0);
	}
	
	@Override
	public Collection<Books> selectByKeyword(BooksSearchCommand booksSearchCommand) {
		return sqlSessionTemplate.selectList("selectByKeyword", booksSearchCommand);
	}
}
