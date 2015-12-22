package com.itcld.imoveis_ws.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.bo._123iBO;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema._123i.Imovel123IResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Endpoint
public class _123iEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private _123iBO bo;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/123i";
	private static final String QNAME = "Carga";
	
	@PostConstruct
	public void init() {
		bo = new _123iBO();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovel123iRequest")
	@ResponsePayload
	public Imovel123IResponse imovel123iRequest(@RequestPayload Imovel123IRequest request) {
		
		Imovel123IResponse response = new Imovel123IResponse();
		
		bo.validaRequest(request);
		
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.I123);
		
		if(bo.isXmlPraia())
			parser.marshall(bo.getCargaPraia().getClass(), bo.getCargaPraia(), QNAME, TipoImobiliaria.I123_PRAIA);
		
		if(bo.isXmlCampo())
			parser.marshall(bo.getCargaCampo().getClass(), bo.getCargaCampo(), QNAME, TipoImobiliaria.I123_CAMPO);
		
		return response;
	}
	
}
