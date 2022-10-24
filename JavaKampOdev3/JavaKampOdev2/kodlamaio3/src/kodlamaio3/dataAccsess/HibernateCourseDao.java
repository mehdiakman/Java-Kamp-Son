package kodlamaio3.dataAccsess;

import kodlamaio3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibarnate ile veritabanına eklendi");
		
	}
	
}
