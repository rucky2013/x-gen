package com.xgen.config.manager;

import java.util.HashMap;
import java.util.Map;

import com.xgen.config.implementors.GenImplementor;
import com.xgen.config.implementors.ModuleGenImplementor;
import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;
import com.xgen.config.vo.NeedGenModel;

public class ConfigManager {
	
	private static ConfigManager manager = null;
	
	private ConfigManager(GenImplementor provider) {
		readConfig(provider);
	}
	
	public static ConfigManager getInstance(GenImplementor provider) {
		if(manager == null) {
			manager = new ConfigManager(provider);
		}
		return manager;
	}
	
	//实现数据缓存
	private GenConfigModel genConf = new GenConfigModel();
	private Map<String, ModuleConfModel> moduleConf = new HashMap<>();

	public GenConfigModel getGenConfig() {
		return this.genConf;
	}
	
	public Map<String, ModuleConfModel> getMapModuleConfig() {
		return this.moduleConf;
	}
	
	/**
	 * 去真正的实现数据的读取
	 */
	private void readConfig(GenImplementor provider) {
		//读取核心配置文件
		readGenConfig(provider);
		for(NeedGenModel model : genConf.getNeedGens()) {
			readOneModelConfig(model);
		}
	}

	private void readGenConfig(GenImplementor provider) {
		genConf.setNeedGens(provider.getNeedGens());
		genConf.setThemes(provider.getThemes());
		genConf.setMapConstants(provider.getMapConstants());
	}
	
	private void readOneModelConfig(NeedGenModel model) {
		ModuleConfModel conf = new ModuleConfModel();
		
		String themeId = model.getTheme();
		String providerClassName = genConf.getThemeById(themeId).getProvider().get(model.getProvider());
		ModuleGenImplementor userGenConfImpl = null;
		try {
			userGenConfImpl = (ModuleGenImplementor) Class.forName(providerClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		conf = userGenConfImpl.getBaseModuleConfModel(model.getParams());
		conf.setTheme(themeId);
		conf.setNeedGendTypes(userGenConfImpl.getMapNeedGenTypes(model.getParams()));
		conf.setExtendsMap(userGenConfImpl.getMapExtends(genConf, model.getParams()));
		
		//把模块的配置数据设置到缓存里
		this.moduleConf.put(conf.getId(), conf);
	}
	
}
