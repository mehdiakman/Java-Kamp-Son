package kodlamaio3.business;

import java.lang.System.Logger;
import java.util.List;

import kodlamaio3.dataAccsess.CategoryDao;
import kodlamaio3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categorise;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categorise) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categorise = categorise;
		
		public void add(Category category) throws Exception {
			for(Category newCatogryName:categories)
		if (category.getCategoryName() == newCatogryName.getCategoryName()) {
            throw new Exception("Kategori Ismi Tekrar Edemez!");
		}	
		
			
			categoryDao.add(category);
			 categories.add(category);
				
			for(Logger logger : loggers) {
				logger.log(category.getCategoryName());
				
			}
		
		}
	}
	
	
	
}
