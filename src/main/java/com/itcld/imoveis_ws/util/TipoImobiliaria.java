package com.itcld.imoveis_ws.util;

public enum TipoImobiliaria {
	
	I123				(0L,"123i", false),
	I123_PRAIA_CAMPO	(1L,"123i_praia_campo", false),
	BOSSANOVA			(2L,"BossaNova", false),
	IMOVELWEB			(3l, "ImovelWeb", false),
	MOVING				(4L, "Moving", false),
	COUNTRY				(5L,"Country", false),
	VIVAREAL			(6L,"VivaReal", false),
	DEFAULT				(7L,"DEFAULT", false),
	
	I123_LOG			(8L,"123i_log", true),
	BOSSANOVA_LOG		(9L,"BossaNova_log", true),
	IMOVELWEB_LOG		(10L, "ImovelWeb_log", true),
	MOVING_LOG			(11L, "Moving_log", true),
	COUNTRY_LOG			(12L,"Country_log", true),
	VIVAREAL_LOG		(13L,"VivaReal_log", true);
	
	
	private Long id;
	private String value;
	private boolean tipoLog;
	
	private TipoImobiliaria(Long id, String value, boolean tipoLog) {
		this.id = id;
		this.value = value;
		this.tipoLog = tipoLog;
	}
	
	public final Long id(){
		return id;
	}
	public final String value(){
		return value;
	}
	public final boolean isTipoLog(){
		return tipoLog;
	}

}
