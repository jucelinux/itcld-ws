package com.itcld.imoveis_ws.util;

public enum TipoImobiliaria {
	
	I123(0L,"123i", "/var/www/arquivos_xml/123i"),
	BOSSANOVA(1L,"Bossa Nova", "/var/www/arquivos_xml/BossaNova"),
	IMOVELWEB(2l, "Imovel Web", "/var/www/arquivos_xml/"),
	MOVING(3L, "Moving", "/var/www/arquivos_xml/ImovelWeb"),
	COUNTRY(4L,"Country", "/var/www/arquivos_xml/Moving");
	
	private Long id;
	private String value;
	private String path;
	
	private TipoImobiliaria(Long id, String value, String path) {
		this.id = id;
		this.value = value;
		this.path = path;
	}
	
	public final Long id(){
		return id;
	}
	public final String value(){
		return value;
	}
	
	public final String path(){
		return path;
	}

}
