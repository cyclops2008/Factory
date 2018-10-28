package java;

public class FactoryDB implements IDaoFactory {
	Person[] person = new Person[10];
	
	public FactoryDB() {
		fillArrayPerson();
	}
	@Override
	public Person getPersonById(int id) {
		return person[id];
	}
	private void fillArrayPerson() {
		for(int i=0;i<10;i++) {
			person[i]=new Person(i,"DB.FirstName","DB.LastName");
		}
	}
}