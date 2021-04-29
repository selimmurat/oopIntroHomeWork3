package oopIntroHomeWork3;

public class Instructor extends User {

	private String writeHomeWorks;

	public Instructor(int id, String nationalIdentity, String name, String lastName, String mailAdress, String sifre,
			String role, String writeHomeWorks) {

		super(id, nationalIdentity, name, lastName, mailAdress, sifre, role);
		this.writeHomeWorks = writeHomeWorks;
	}

	public String getWriteHomeworks() {
		return writeHomeWorks;
	}

	public void setWriteHomeworks(String writeHomeworks) {
		this.writeHomeWorks = writeHomeworks;
	}
}
