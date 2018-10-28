package java;

public class FactoryXML implements IDaoFactory {
	Person[] person = new Person[10];
	
	public FactoryXML() {
		fillArrayPerson();
	}
	@Override
	public Person getPersonById(int id) {
		return person[id];
	}
	private void fillArrayPerson() {
		for(int i=0;i<10;i++) {
			person[i]=new Person(i,"XML.FirstName","XML.LastName");
		}
	}
}