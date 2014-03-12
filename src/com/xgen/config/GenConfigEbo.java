package com.xgen.config;

import java.util.Map;

import com.xgen.config.implementors.GenImplementor;
import com.xgen.config.manager.ConfigManager;
import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public class GenConfigEbo implements GenConfigEbi {
	
	private static GenConfigEbo ebo = null;
	
	private GenImplementor provider = null;
	
	private GenConfigEbo(GenImplementor provider) {
		this.provider = provider;
	}
	
	public static GenConfigEbi getInstance(GenImplementor provider) {
		if(ebo == null) {
			if(provider == null) {
				throw new IllegalArgumentException("第一次创建配置对象时，provider不能为空");
			}
			ebo = new GenConfigEbo(provider);
		}
		return ebo;
	}
	

	@Override
	public GenConfigModel getConfig() {
		return ConfigManager.getInstance(provider).getGenConfig();
	}

	@Override
	public Map<String, ModuleConfModel> getMapModuleConf() {
		return ConfigManager.getInstance(provider).getMapModuleConfig();
	}

}
