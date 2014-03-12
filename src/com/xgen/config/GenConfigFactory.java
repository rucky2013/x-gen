package com.xgen.config;

import com.xgen.config.implementors.GenImplementor;

public class GenConfigFactory {

	private GenConfigFactory() {}
	
	public GenConfigEbi createGenConfigEbi(GenImplementor provider) {
		return GenConfigEbo.getInstance(provider);
	}
}
