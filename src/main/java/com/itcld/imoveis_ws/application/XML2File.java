package com.itcld.imoveis_ws.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.itcld.imoveis_ws.util.FolderConfig;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Component
@EnableConfigurationProperties(FolderConfig.class)
public class XML2File {

	private static final Logger logger = LoggerFactory.getLogger(XML2File.class);
			
	@Autowired
	private FolderConfig folderConfig;

	@SuppressWarnings("rawtypes")
	public void marshall(Class objClass, Object obj, String qName, TipoImobiliaria tipo) {
		
		@SuppressWarnings("unchecked")
		JAXBElement<Object> jaxbElement = new JAXBElement<Object>(new QName(null, qName), objClass, obj);
		Marshaller marshaller = criaMarshaller(objClass);
		geraXml(tipo, jaxbElement, marshaller);
		
	}

	private void geraXml(TipoImobiliaria tipo, JAXBElement<Object> jaxbElement, Marshaller marshaller) {

		Writer writer = null;
		writer = criaArquivo(tipo);
		
		try {	
			marshaller.marshal(jaxbElement, writer);
		} catch (JAXBException e) {
			logger.error("Erro ao fazer parser do arquivo: ", e.getCause());
			e.printStackTrace();
		} finally {
			fechaArquivo(writer);
		}
		
	}

	@SuppressWarnings("rawtypes")
	private Marshaller criaMarshaller(Class objClass) {
		JAXBContext jaxbContext = null;
		Marshaller marshaller = null;
		try {
			jaxbContext = JAXBContext.newInstance(objClass);
			marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			logger.error("Erro ao criar Marshaller: ", e.getCause());
			e.printStackTrace();
		}
		return marshaller;
	}

	private FileWriter criaArquivo(TipoImobiliaria tipo) {

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss.SSS");
		StringBuilder fileName = new StringBuilder();
		File file;
		String folder;
		
		if(tipo.isTipoLog()){
			folder = getFolder(tipo);
			fileName.append(sdf.format(c.getTime()));
			fileName.append(".xml");
			file = new File(folder,fileName.toString());
		}else{
			folder = getFolder(TipoImobiliaria.DEFAULT);
			fileName.append(tipo.name());
			fileName.append(".xml");
			file = new File(folder,fileName.toString());
		}
		
		logger.info("Criando arquivo: " + folder + " - "+ fileName.toString());
		
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				logger.error("Erro ao criar arquivo físico ", e.getCause());
				e.printStackTrace();
			}
		}

		try {
			return new FileWriter(file,false);
		} catch (IOException e) {
			logger.error("Erro ao criar FileWriter ", e.getCause());
			e.printStackTrace();
		}

		return null;
	}

	private String getFolder(TipoImobiliaria tipo) {
		if (tipo.equals(TipoImobiliaria.BOSSANOVA_LOG)) {
			return folderConfig.getDirBossaNova();
		} else if (tipo.equals(TipoImobiliaria.I123_LOG)) {
			return folderConfig.getDir123i();
		} else if (tipo.equals(TipoImobiliaria.IMOVELWEB_LOG)) {
			return folderConfig.getDirImovelWeb();
		} else if (tipo.equals(TipoImobiliaria.MOVING_LOG)) {
			return folderConfig.getDirMoving();
		} else if (tipo.equals(TipoImobiliaria.VIVAREAL_LOG)) {
			return folderConfig.getDirVivaReal();
		}

		return folderConfig.getDirDefault();
	}

	private void fechaArquivo(Writer writer) {
		try {
			writer.close();
		} catch (IOException e) {
			logger.error("Erro ao fechar FileWriter ", e.getCause());
			e.printStackTrace();
		}
	}
}
