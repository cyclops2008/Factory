package java;

public class Person {
	int	id;
	String firstName;
	String lastName;
	
	public Person(int id, String firstName, String lastName) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}