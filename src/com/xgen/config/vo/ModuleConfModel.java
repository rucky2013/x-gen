package com.xgen.config.vo;

import java.util.List;
import java.util.Map;

public class ModuleConfModel {

	private String id;
	private String theme;
	private Map<String, List<String>> needGendTypes;
	private Map<String, ExtendConfModel> extendsMap;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Map<String, List<String>> getNeedGendTypes() {
		return needGendTypes;
	}

	public void setNeedGendTypes(Map<String, List<String>> needGendTypes) {
		this.needGendTypes = needGendTypes;
	}

	public Map<String, ExtendConfModel> getExtendsMap() {
		return extendsMap;
	}

	public void setExtendsMap(Map<String, ExtendConfModel> extendsMap) {
		this.extendsMap = extendsMap;
	}

}
