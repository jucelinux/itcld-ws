package com.itcld.imoveis_ws.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

public class XMLParser {
	
	
	@SuppressWarnings("rawtypes")
	public static void marshall(Class objClass, Object obj, String qName, TipoImobiliaria tipo) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(objClass);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		@SuppressWarnings("unchecked")
		JAXBElement<Object> jaxbElement = new JAXBElement<Object>(new QName(null, qName), objClass, obj);
		
		if(tipo.equals(TipoImobiliaria.I123){
			
		}
		marshaller.marshal(jaxbElement, System.out);
	}

}
