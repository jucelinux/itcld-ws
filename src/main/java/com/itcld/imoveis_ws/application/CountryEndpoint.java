package com.itcld.imoveis_ws.application;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itcld.imoveis_ws.schema.country.Country;
import com.itcld.imoveis_ws.schema.country.GetCountryRequest;
import com.itcld.imoveis_ws.schema.country.GetCountryResponse;
import com.itcld.imoveis_ws.util.TipoImobiliaria;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/country";
	
	
	private Country country;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	XML2File parser;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) throws JAXBException {
		GetCountryResponse response = new GetCountryResponse();
		this.country = countryRepository.findCountry(request.getName());
		response.setCountry(this.country);

		parser.marshall(country.getClass(), country, "country", TipoImobiliaria.COUNTRY);
		
		return response;
	}



}
