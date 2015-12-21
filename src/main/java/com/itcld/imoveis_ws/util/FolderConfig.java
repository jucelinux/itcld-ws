package com.itcld.imoveis_ws.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="folders")
public class FolderConfig {
	
	private String dirMoving;
	private String dir123i;
	private String dirImovelWeb;
	private String dirBossaNova;
	private String dirVivaReal;
	private String dirDefault;
	
	public String getDirDefault() {
		return dirDefault;
	}
	public void setDirDefault(String dirDefault) {
		this.dirDefault = dirDefault;
	}
	public String getDirMoving() {
		return dirMoving;
	}
	public void setDirMoving(String dirMoving) {
		this.dirMoving = dirMoving;
	}
	public String getDir123i() {
		return dir123i;
	}
	public void setDir123i(String dir123i) {
		this.dir123i = dir123i;
	}
	public String getDirImovelWeb() {
		return dirImovelWeb;
	}
	public void setDirImovelWeb(String dirImovelWeb) {
		this.dirImovelWeb = dirImovelWeb;
	}
	public String getDirBossaNova() {
		return dirBossaNova;
	}
	public void setDirBossaNova(String dirBossaNova) {
		this.dirBossaNova = dirBossaNova;
	}
	public String getDirVivaReal() {
		return dirVivaReal;
	}
	public void setDirVivaReal(String dirVivaReal) {
		this.dirVivaReal = dirVivaReal;
	}
	    
}
