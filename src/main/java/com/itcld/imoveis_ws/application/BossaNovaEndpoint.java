package com.itcld.imoveis_ws.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema._123i.Imovel123IResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Endpoint
public class BossaNovaEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/bossanova";
	private static final String QNAME = "Carga";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovel123iRequest")
	@ResponsePayload
	public Imovel123IResponse imovel123iRequest(@RequestPayload Imovel123IRequest request) {
		Imovel123IResponse response = new Imovel123IResponse();
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.BOSSANOVA);
		return response;
	}
	
}
