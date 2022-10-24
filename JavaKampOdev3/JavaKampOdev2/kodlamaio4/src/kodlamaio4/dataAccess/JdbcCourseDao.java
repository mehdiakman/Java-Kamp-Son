package kodlamaio4.dataAccess;

import kodlamaio4.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
	} 
}
