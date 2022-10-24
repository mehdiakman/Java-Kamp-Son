package kodlamaio3.dataAccsess;

import kodlamaio3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
