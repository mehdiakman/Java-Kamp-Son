package kodlamaio3.dataAccsess;

import kodlamaio3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
