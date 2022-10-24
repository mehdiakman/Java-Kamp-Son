package kodlamaio3;

public class Main {

	import java.util.ArrayList;
	import java.util.List;
	import kodlamaio3.business.CategoryManager;
    import kodlamaio3.business.CourseManager;
    import kodlamaio3.business.InstructorManager;
    import kodlamaio3.corelogging.DatabaseLogger;
	import kodlamaio3.corelogging.FileLogger;
	import kodlamaio3.corelogging.Logger;
	import kodlamaio3.corelogging.MailLogger;
	import kodlamaio3.dataAccsess.HibernateCategoryDao;
    import kodlamaio3.dataAccsess.HibernateCourseDao;
    import kodlamaio3.dataAccsess.HibernateInstructorDao;
    import kodlamaio3.dataAccsess.JdbcCategoryDao;
	import kodlamaio3.entities.Category;
    import kodlamaio3.entities.Course;
    import kodlamaio3.entities.Instructor;

     public class Main {

		public static void main(String[] args) throws Exception {
			
			Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
			
		System.out.println("***********CATEGORY*********");
		
		        List<Category> categories = new ArrayList<>();
		        categories.add(new Category(1,"Programlama"));
		        categories.add(new Category(2,"Mobil Programlama"));
		       
		       
      CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers,categories);
		    
		        try {
		            categoryManager.add(new Category(3,"Web Tasarimi"));
		           
		        }catch (Exception e){
		            System.out.println(e);
		        }
		            
		    			
		    		System.out.println("***********COURSE*********");
		    		   
		    		        List<Course> courses = new ArrayList<>();
		    		        courses.add(new Course(1,"Java","Programlama","Engin Demirog",200));
		    		        courses.add(new Course(2,"Kotlin","Mobil Programlama","atil Samancioglu",250));
		    		       
		    		        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
		    		        
		    		       try { courseManager.add(new Course(3,"Flutter","Mobil Uygulama","Veli Bacik",-1));
		    		           }catch (Exception e1){
		    		            System.out.println(e1);
		    		        }

		        
		        
		        System.out.println("***********INSTRUCTOR*********");
				
				Instructor newInstructor = new Instructor(1, "Engin Demirog");   
				       
		     InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
			   instructorManager.add(newInstructor);
		}

}
