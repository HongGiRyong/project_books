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
	public Collection<RegisterBooks>  listAll() {
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public void insert(RegisterBooks registerBooks) {
		sqlSessionTemplate.insert("insert", registerBooks);
	}
	
	@Override
	public RegisterBooks selectByNum(Long num) {
		List<RegisterBooks> results = sqlSessionTemplate.selectList("selectByNum", num);
		return results.isEmpty() ? null : results.get(0);
	}
	
	@Override
	public Collection<RegisterBooks> selectByKeyword(BooksSearchCommand booksSearchCommand) {
		return sqlSessionTemplate.selectList("selectByKeyword", booksSearchCommand);
	}
}
