package oopIntroHomeWork3;

public class StudentManager {
	
public void add(Student student,Logger logger) {
		
		System.out.println(student.getName()  + " eklenmiştir.");
		logger.log();
	}	
	
	// multi add methods
	public void add (Student[] students,Logger logger) {
		for (Student student : students) {
			System.out.println(student.getName() + " eklenmiştir.");
			System.out.println(logger);
		}
	} 
	
	public void delete (Student student) {
	
		System.out.println(student.getName()+  " kayıdı silinmiştir. ");
	}

}
