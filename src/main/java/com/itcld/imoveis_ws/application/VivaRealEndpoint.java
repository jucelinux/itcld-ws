package com.itcld.imoveis_ws.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.util.TipoImobiliaria;
import com.vivareal.feeds.vrsync.ImovelVivaRealRequest;
import com.vivareal.feeds.vrsync.ImovelVivaRealResponse;

@Endpoint
public class VivaRealEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private static final String NAMESPACE_URI = "http://www.vivareal.com/schemas/1.0/VRSync";
	
	@PostConstruct
	public void init() {
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovelVivaRealRequest")
	@ResponsePayload
	public ImovelVivaRealResponse imovelVivaRealRequest(@RequestPayload ImovelVivaRealRequest request) {
		
		parser.marshall(request.getListingDataFeed().getClass(), request.getListingDataFeed(), "ListingDataFeed", TipoImobiliaria.VIVAREAL);
		parser.marshall(request.getListingDataFeed().getClass(), request.getListingDataFeed(), "ListingDataFeed", TipoImobiliaria.VIVAREAL_LOG);
		
		ImovelVivaRealResponse response = new ImovelVivaRealResponse();
		return response;
	}
	
}
