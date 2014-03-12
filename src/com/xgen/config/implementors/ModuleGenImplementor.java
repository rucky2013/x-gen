package com.xgen.config.implementors;

import java.util.List;
import java.util.Map;

import com.xgen.config.vo.ExtendConfModel;
import com.xgen.config.vo.GenConfigModel;
import com.xgen.config.vo.ModuleConfModel;

public interface ModuleGenImplementor {

	public ModuleConfModel getBaseModuleConfModel(Map<String,String> param);
	
	public Map<String,List<String>> getMapNeedGenTypes(Map<String,String> param);
	
	public Map<String,ExtendConfModel> getMapExtends(GenConfigModel gm,Map<String,String> param);
	
}
