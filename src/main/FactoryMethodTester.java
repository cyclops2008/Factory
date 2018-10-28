package main;

import daofactory.DaoFactory;
import person.Person;

public class FactoryMethodTester {
	
	public static void main(String[] args) {
		DaoFactory daofac = new DaoFactory();
		String[] nameArr = {"XML","DataBase","WebService"};
		for(String name: nameArr){
			daofac.setSource(name);
			for(int i=0;i<10;i++) {
				Person newPerson = daofac.getPersonById(i);
				System.out.println(newPerson.getId() + ": " + newPerson.getFirstName() + " " + newPerson.getLastName());				
			}
			System.out.println("");
		}
	}
}