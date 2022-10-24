package kodlamaio3.dataAccsess;

import kodlamaio3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
