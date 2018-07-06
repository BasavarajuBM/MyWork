package com.basu.accessright.starter;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.basu.accessright.services.impl.ArServiceImpl;

@Configuration
public class AccessRightJersyConfigurer extends ResourceConfig {
	
	public AccessRightJersyConfigurer() {
		register(ArServiceImpl.class);
	}

}
