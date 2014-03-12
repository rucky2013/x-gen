package com.xgen.config;

public class GenConfigFactory {

	private GenConfigFactory() {}
	
	public GenConfigEbi createGenConfigEbi() {
		return GenConfigEbo.getInstance();
	}
}
