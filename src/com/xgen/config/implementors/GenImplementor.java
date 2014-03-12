package com.xgen.config.implementors;

import java.util.List;
import java.util.Map;

import com.xgen.config.vo.NeedGenModel;
import com.xgen.config.vo.ThemeModel;

public interface GenImplementor {

	public List<NeedGenModel> getNeedGens();
	
	public List<ThemeModel> getThemes();
	
	public Map<String,String> getMapConstants();
	
}
