package xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import users.UserCollection;

public class XMLWorker {
	public void writeToXmlFile(String xmlFile,UserCollection collection) throws JAXBException {
		JAXBContext context=JAXBContext.newInstance(UserCollection.class);
		Marshaller m=context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(collection, new File(xmlFile));
		
	}

}
