package com.basu.accessright.starter;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.basu.accessright.services.impl.ArServiceImpl;

//@Component
public class AccessRightJersyConfigurer extends ResourceConfig {
	
	public AccessRightJersyConfigurer() {
		register(ArServiceImpl.class);
	}

}
