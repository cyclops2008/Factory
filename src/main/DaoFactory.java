package main;

import java.util.Map;
import java.util.HashMap;

public class DaoFactory implements IDaoFactory {
	Map<SourceType,IDaoFactory> daoMap=new HashMap<>();
	IDaoFactory factory;
	
	public void setSource(String source) {
		newMapping();
		factory = daoMap.get(main.SourceType.valueOf(source));
	}
	@Override
	public Person getPersonById(int id) {	
		return factory.getPersonById(id);
	}
	private void newMapping() {
		daoMap.put(main.SourceType.XML, new FactoryXML());
		daoMap.put(main.SourceType.DataBase, new FactoryDB());
		daoMap.put(main.SourceType.WebService, new FactoryWS());
	}
}
