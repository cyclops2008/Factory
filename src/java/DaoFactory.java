package java;

import java.util.Map;
import java.util.HashMap;

public class DaoFactory implements IDaoFactory {
	Map<SourceType,IDaoFactory> daoMap=new HashMap<>();
	IDaoFactory factory;
	
	public DaoFactory() {
		newMapping();
	}
	
	public void setSource(String source) {
		factory = daoMap.get(java.SourceType.valueOf(source));
	}
	@Override
	public Person getPersonById(int id) {	
		return factory.getPersonById(id);
	}
	private void newMapping() {
		daoMap.put(java.SourceType.XML, new FactoryXML());
		daoMap.put(java.SourceType.DataBase, new FactoryDB());
		daoMap.put(java.SourceType.WebService, new FactoryWS());
	}
}
