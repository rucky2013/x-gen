package com.xgen.config;

import java.util.Map;

import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public interface GenConfigEbi {

	/**
	 * 获取x-gen核心框架运行所需要的配置数据Model
	 * 
	 * @return 核心框架运行所需要的配置数据model
	 */
	public GenConfigModel getConfig();

	/**
	 * 获取需要生成的所有模块的配置
	 * 
	 * @return 包含所有需要生成的所有模块的配置数据的Map，key-模块的id，value-相应的模块的配置数据的model
	 */
	public Map<String, ModuleConfModel> getMapModuleConf();
	
}
