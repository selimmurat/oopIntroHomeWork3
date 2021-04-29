package oopIntroHomeWork3;

public class UserManager {
	
	public void add(User[] users, Logger logger)
	{
		for (User user : users) {
			System.out.println(user.getName()  + " kaydedilmiştir. ");
			logger.log();
		}		
	}
	
	
}
