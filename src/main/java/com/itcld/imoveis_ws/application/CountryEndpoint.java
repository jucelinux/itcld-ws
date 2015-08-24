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
import com.itcld.imoveis_ws.util.XMLParser;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://itcld.com/imoveis-ws/schema/country";

	private CountryRepository countryRepository;
	private Country country;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) throws JAXBException {
		GetCountryResponse response = new GetCountryResponse();
		this.country = countryRepository.findCountry(request.getName());
		response.setCountry(this.country);

		try {
			XMLParser.marshall(country.getClass(), country, "country", TipoImobiliaria.I123);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}



}
