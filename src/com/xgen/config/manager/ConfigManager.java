package com.xgen.config.manager;

import java.util.HashMap;
import java.util.Map;

import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public class ConfigManager {
	
	private static ConfigManager manager = null;
	
	private ConfigManager() {
		readConfig();
	}
	
	public static ConfigManager getInstance() {
		if(manager == null) {
			manager = new ConfigManager();
		}
		return manager;
	}
	
	//实现数据缓存
	private GenConfigModel genConf = new GenConfigModel();
	private Map<String, ModuleConfModel> moduleConfMap = new HashMap<>();

	public GenConfigModel getGenConfig() {
		return this.genConf;
	}
	
	public Map<String, ModuleConfModel> getMapModuleConfig() {
		return this.moduleConfMap;
	}
	
	/**
	 * 去真正的实现数据的读取
	 */
	private void readConfig() {
		//读取核心配置文件
		readGenConfig();
	}

	private void readGenConfig() {
		
	}
	
}
