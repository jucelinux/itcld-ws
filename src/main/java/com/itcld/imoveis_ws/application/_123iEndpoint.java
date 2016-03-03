package com.itcld.imoveis_ws.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.bo._123iBO;
import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema._123i.Imovel123IResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

import static com.itcld.imoveis_ws.util.AppConst.QNAME_CARGA;

@Endpoint
public class _123iEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private _123iBO bo;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/123i";
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovel123iRequest")
	@ResponsePayload
	public Imovel123IResponse imovel123iRequest(@RequestPayload Imovel123IRequest request) {
		
		bo = new _123iBO();
		bo.validaRequest(request);
		
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME_CARGA, TipoImobiliaria.I123_LOG);
		parser.marshall(bo.getCargaNormal().getClass(), bo.getCargaNormal(), QNAME_CARGA, TipoImobiliaria.I123);
		parser.marshall(bo.getCargaPraiaCampo().getClass(), bo.getCargaPraiaCampo(), QNAME_CARGA, TipoImobiliaria.I123_PRAIA_CAMPO);
		
		Imovel123IResponse response = new Imovel123IResponse();
		return response;
	}
	
}
