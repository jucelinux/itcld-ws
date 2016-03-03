package com.itcld.imoveis_ws.application;

import static com.itcld.imoveis_ws.util.AppConst.QNAME_CARGA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema.moving.ImovelMovingRequest;
import com.itcld.imoveis_ws.schema.moving.ImovelMovingResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Endpoint
public class MovingEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/moving";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovelMovingRequest")
	@ResponsePayload
	public ImovelMovingResponse imovelMovingRequest(@RequestPayload ImovelMovingRequest request) {
		
		
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME_CARGA, TipoImobiliaria.MOVING);
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME_CARGA, TipoImobiliaria.MOVING_LOG);
		
		ImovelMovingResponse response = new ImovelMovingResponse();
		return response;
	}
	
}
