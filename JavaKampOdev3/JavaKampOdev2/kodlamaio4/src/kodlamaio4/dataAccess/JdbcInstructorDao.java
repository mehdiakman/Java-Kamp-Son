package kodlamaio4.dataAccess;

import kodlamaio4.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instInstructor) {
		System.out.println("Jdbc ile veritabanına eklendi");
	}
}
