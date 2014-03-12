package com.xgen.config.vo;

import java.util.List;
import java.util.Map;

/**
 * x-gen核心框架配置对应的数据model
 * 
 * @author wenyou <br/>
 *         2014年3月12日
 * 
 */
public class GenConfigModel {

	/**
	 * 描述注册的多个用户需要生成的模块的model
	 */
	private List<NeedGenModel> needGens;

	/**
	 * 描述注册的多个外部主题的model
	 */
	private List<ThemeModel> themes;

	/**
	 * 描述通用的常量定义的集合
	 */
	private Map<String, String> mapConstants;

	public List<NeedGenModel> getNeedGens() {
		return needGens;
	}

	public void setNeedGens(List<NeedGenModel> needGens) {
		this.needGens = needGens;
	}

	public List<ThemeModel> getThemes() {
		return themes;
	}

	public void setThemes(List<ThemeModel> themes) {
		this.themes = themes;
	}

	public Map<String, String> getMapConstants() {
		return mapConstants;
	}

	public void setMapConstants(Map<String, String> mapConstants) {
		this.mapConstants = mapConstants;
	}

	public ThemeModel getThemeById(String themeId) {
		for (ThemeModel tm : this.themes) {
			if (tm.getId().equals(themeId)) {
				return tm;
			}
		}
		return new ThemeModel();
	}

}
