package com.itcld.imoveis_ws.util;

public enum TipoImobiliaria {
	
	I123(0L,"123i"),
	BOSSANOVA(1L,"BossaNova"),
	IMOVELWEB(2l, "ImovelWeb"),
	MOVING(3L, "Moving"),
	COUNTRY(4L,"Country");
	
	private Long id;
	private String value;
	
	private TipoImobiliaria(Long id, String value) {
		this.id = id;
		this.value = value;
	}
	
	public final Long id(){
		return id;
	}
	public final String value(){
		return value;
	}

}
