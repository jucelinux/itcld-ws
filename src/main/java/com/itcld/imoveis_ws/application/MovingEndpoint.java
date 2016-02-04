package com.itcld.imoveis_ws.application;

import static com.itcld.imoveis_ws.util.AppConst.QNAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema._123i.Imovel123IRequest;
import com.itcld.imoveis_ws.schema.moving.ImovelMovingResponse;

import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Endpoint
public class MovingEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/moving";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovelMovingRequest")
	@ResponsePayload
	public ImovelMovingResponse imovel123iRequest(@RequestPayload Imovel123IRequest request) {
		
		
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.MOVING);
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.MOVING_LOG);
		
		ImovelMovingResponse response = new ImovelMovingResponse();
		return response;
	}
	
}
