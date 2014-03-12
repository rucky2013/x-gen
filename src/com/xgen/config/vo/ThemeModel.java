package com.xgen.config.vo;

import java.util.Map;

public class ThemeModel {

	private String id;
	private String location;
	private Map<String, GenTypeModel> genType;
	private Map<String, String> genOutType;
	private Map<String, String> provider;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Map<String, GenTypeModel> getGenType() {
		return genType;
	}

	public void setGenType(Map<String, GenTypeModel> genType) {
		this.genType = genType;
	}

	public Map<String, String> getGenOutType() {
		return genOutType;
	}

	public void setGenOutType(Map<String, String> genOutType) {
		this.genOutType = genOutType;
	}

	public Map<String, String> getProvider() {
		return provider;
	}

	public void setProvider(Map<String, String> provider) {
		this.provider = provider;
	}

}
