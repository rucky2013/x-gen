package com.xgen.config;

import java.util.Map;

import com.xgen.config.manager.ConfigManager;
import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public class GenConfigEbo implements GenConfigEbi {
	
	private static GenConfigEbo ebo = null;
	
	private GenConfigEbo() {}
	
	public static GenConfigEbi getInstance() {
		if(ebo == null) {
			ebo = new GenConfigEbo();
		}
		return ebo;
	}
	

	@Override
	public GenConfigModel getConfig() {
		return ConfigManager.getInstance().getGenConfig();
	}

	@Override
	public Map<String, ModuleConfModel> getMapModuleConf() {
		return ConfigManager.getInstance().getMapModuleConfig();
	}

}
