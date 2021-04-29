package oopIntroHomeWork3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "123", "Selim", "Murat", "selim.murat@windowslive.com", "112233", "student");
		Student student2 = new Student(2, "122223", "Adem", "Coşkun", "adem.coskun@windowslive.com", "421311", "student");
		
		Instructor instructor1 = new Instructor(1, "1123646", "Engin", "Demiroğ", "engin.demiroğ@windowslive.com", "000112233", "Teacher","3. Gün Ödev 2");
		
	
		
		User[] users= {student1,student2,instructor1};

		UserManager userManager = new UserManager();		
		userManager.add(users, new DatabaseLogger());
		
		System.out.println("*/*************************************************************//");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1, new FileLogger());
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1, new EmailLogger());

	}

}
