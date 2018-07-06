package com.basu.accessright.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.basu.accessright.vo.ResponseVO;

@Path("/ar")
public interface ArService {
	
	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseVO fetchAllAccessrights();

}
