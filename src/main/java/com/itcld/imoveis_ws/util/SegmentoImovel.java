package com.itcld.imoveis_ws.util;

public enum SegmentoImovel {

	APARTAMENTO_DUPLEX 	 	("apartamento duplex", "apartamento padrao", "duplex"),
	STUDIO 					("studio", "studio", ""),
	LOFT 					("loft", "loft", ""),
	FLAT 					("flat", "flat", ""),
	COBERTURA_DUPLEX 		("cobertura", "apartamento padrao", ""),
	COBERTURA 				("cobertura", "residencial", ""),
	APARTAMENTO 			("apartamento", "apartamento padrao", ""),
	APARTAMENTO_TRIPLEX 	("apartamento", "triplex", ""),
	CASA_CONDOMINIO 		("casa em condominio", "casa de condominio", ""),
	CASA					("casa", "", ""),
	AREA					("area", "residencial", ""),
	TERRENO_CONDOMINIO 	 	("terreno em condominio", "loteamento/condominio", ""),
	TERRENO 				("terreno", "residencial", ""),
	FAZENDA 				("fazenda", "fazenda", ""),
	CHACARA 				("chacara", "chacara", ""),
	NAO_IDENTIFICADO		("", "", "");
	
	public String tipo;
	public String subtipo;
	public String categoria;
	
	SegmentoImovel(String tipo, String subtipo, String categoria){
		this.tipo = tipo;
		this.categoria = categoria;
		this.subtipo = subtipo;
	}
	
	public final static SegmentoImovel getSegmentoImovel(String tipoImovel){
		
		if(APARTAMENTO_DUPLEX.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return APARTAMENTO_DUPLEX;
		}else if(STUDIO.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return STUDIO;
		}else if(LOFT.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return LOFT;
		}else if(FLAT.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return FLAT;
		}else if(COBERTURA_DUPLEX.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return COBERTURA_DUPLEX;
		}else if(COBERTURA.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return COBERTURA;
		}else if(APARTAMENTO.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return APARTAMENTO;
		}else if(APARTAMENTO_TRIPLEX.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return APARTAMENTO_TRIPLEX;
		}else if(CASA_CONDOMINIO.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return CASA_CONDOMINIO;
		}else if(CASA.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return CASA;
		}else if(AREA.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return AREA;
		}else if(TERRENO_CONDOMINIO.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return TERRENO_CONDOMINIO;
		}else if(TERRENO.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return TERRENO;
		}else if(FAZENDA.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return FAZENDA;
		}else if(CHACARA.tipo.toLowerCase().equals(tipoImovel.toLowerCase())){
			return CHACARA;
		}
		return NAO_IDENTIFICADO;
	}

}
