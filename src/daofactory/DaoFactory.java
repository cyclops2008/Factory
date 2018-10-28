package daofactory;

import java.util.Map;
import java.util.HashMap;

import factortype.FactoryDB;
import factortype.FactoryWS;
import factortype.FactoryXML;
import idaofactory.IDaoFactory;
import person.Person;
import sourcetype.SourceType;

public class DaoFactory implements IDaoFactory {
	Map<SourceType,IDaoFactory> daoMap=new HashMap<>();
	IDaoFactory factory;
	
	public void setSource(String source) {
		newMapping();
		factory = daoMap.get(sourcetype.SourceType.valueOf(source));
	}
	@Override
	public Person getPersonById(int id) {	
		return factory.getPersonById(id);
	}
	private void newMapping() {
		daoMap.put(sourcetype.SourceType.XML, new FactoryXML());
		daoMap.put(sourcetype.SourceType.DataBase, new FactoryDB());
		daoMap.put(sourcetype.SourceType.WebService, new FactoryWS());
	}
}
