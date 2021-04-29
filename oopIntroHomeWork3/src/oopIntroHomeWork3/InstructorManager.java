package oopIntroHomeWork3;

public class InstructorManager {
	
	public void add(Instructor instructor,Logger logger) {
		
		System.out.println(instructor.getName()  + " eklenmiştir.");
		logger.log();
	}	
	
	// multi add methods
	public void add (Instructor[] instructors,Logger logger) {
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getName() + " eklenmiştir.");
			System.out.println(logger);
		}
	} 
	
	public void delete (Instructor instructor) {
	
		System.out.println(instructor.getName()+  " kayıdı silinmiştir. ");
	}
}
