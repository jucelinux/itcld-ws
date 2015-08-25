package com.itcld.imoveis_ws.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.itcld.imoveis_ws.util.FolderConfig;
import com.itcld.imoveis_ws.util.TipoImobiliaria;


@Component
@EnableConfigurationProperties(FolderConfig.class)
public class XML2File {
	
	@Autowired
	private FolderConfig folderConfig;
	
	@SuppressWarnings("rawtypes")
	public void marshall(Class objClass, Object obj, String qName, TipoImobiliaria tipo) {
		System.out.println(folderConfig.getDir123i());
		JAXBContext jaxbContext = null;
		Marshaller marshaller = null;
		Writer writer = null;
		
		Calendar c = Calendar.getInstance();
		StringBuilder fileName = new StringBuilder();
		fileName.append(Long.toString(c.getTimeInMillis()));
		fileName.append("_");
		fileName.append(tipo.value());
		fileName.append(".xml");

		try {
			jaxbContext = JAXBContext.newInstance(objClass);
			marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unchecked")
		JAXBElement<Object> jaxbElement = new JAXBElement<Object>(new QName(null, qName), objClass, obj);

		try {
			File file = new File(fileName.toString());
			
			if (!file.exists()) {
                file.createNewFile();
            }
			
			writer = new FileWriter(file);
			marshaller.marshal(jaxbElement, writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
