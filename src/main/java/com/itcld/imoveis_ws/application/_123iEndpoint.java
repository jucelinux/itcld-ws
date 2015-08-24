package com.itcld.imoveis_ws.application;

import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema._123i.Carga;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema._123i.Imovel123IResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;
import com.itcld.imoveis_ws.util.XMLParser;

@Endpoint
public class _123iEndpoint {
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/123i";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovel123iRequest")
	@ResponsePayload
	public Imovel123IResponse imovel123iRequest(@RequestPayload Imovel123IRequest request) {
		Imovel123IResponse response = new Imovel123IResponse();

		try {
			XMLParser.marshall(request.getCarga().getClass(), request.getCarga(), "Carga", TipoImobiliaria.I123);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}
	
}
