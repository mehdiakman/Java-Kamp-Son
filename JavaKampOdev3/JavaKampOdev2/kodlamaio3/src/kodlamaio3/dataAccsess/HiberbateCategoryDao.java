package kodlamaio3.dataAccsess;

import kodlamaio3.entities.Category;

public class HiberbateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
