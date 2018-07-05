package com.basu.accessright.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.basu.accessright.services.ArService;

//@Component
//@Path("/ar")
public class ArServiceImpl implements ArService {
//
//	@Path("/all")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
	public List<String> fetchAllAccessrights() {
		List<String> ars = new ArrayList<String>();
		return ars;
	}

}
