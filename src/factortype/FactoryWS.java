package factortype;

import idaofactory.IDaoFactory;
import person.Person;

public class FactoryWS implements IDaoFactory {
	Person[] person = new Person[10];
	
	public FactoryWS() {
		fillArrayPerson();
	}
	@Override
	public Person getPersonById(int id) {
		return person[id];
	}
	private void fillArrayPerson() {
		for(int i=0;i<10;i++) {
			person[i]=new Person(i,"WS.FirstName","WS.LastName");
		}
	}
}