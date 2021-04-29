package oopIntroHomeWork3;

public class User {

	private int id;
	private String nationalIdentity;
	private String name;
	private String lastName;
	private String mailAdress;
	private String sifre;
	private String role;

	public User() {

	}

	public User(int id, String nationalIdentity, String name, String lastName, String mailAdress, String sifre,
			String role) {
		
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.name = name;
		this.lastName = lastName;
		this.mailAdress = mailAdress;
		this.sifre = sifre;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
