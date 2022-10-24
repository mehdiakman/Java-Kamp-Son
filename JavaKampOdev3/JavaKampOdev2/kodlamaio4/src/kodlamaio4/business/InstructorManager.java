package kodlamaio4.business;

import kodlamaio4.core.logging.Logger;
import kodlamaio4.dataAccess.InstructorDao;
import kodlamaio4.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao,Logger [] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorName()+ "" + instructor.getInstructorLastName());
		}

	}
}
