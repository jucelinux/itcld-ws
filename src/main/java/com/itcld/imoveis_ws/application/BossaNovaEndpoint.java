package com.itcld.imoveis_ws.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema.bossanova.ImovelBossaNovaRequest;
import com.itcld.imoveis_ws.schema.bossanova.ImovelBossaNovaResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

import static com.itcld.imoveis_ws.util.AppConst.QNAME;

@Endpoint
public class BossaNovaEndpoint {
	
	@Autowired
	private XML2File parser;
	
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/bossanova";
	
	@PostConstruct
	public void init() {
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "imovelBossaNovaRequest")
	@ResponsePayload
	public ImovelBossaNovaResponse imovelBossaNovaRequest(@RequestPayload ImovelBossaNovaRequest request) {
		
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.BOSSANOVA);
		parser.marshall(request.getCarga().getClass(), request.getCarga(), QNAME, TipoImobiliaria.BOSSANOVA_LOG);
		
		ImovelBossaNovaResponse response = new ImovelBossaNovaResponse();
		return response;
	}
	
}
