package com.basu.accessright.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.basu.accessright.dao.ArDAO;
import com.basu.accessright.services.ArService;
import com.basu.accessright.vo.ArVO;
import com.basu.accessright.vo.ResponseVO;

@Service
public class ArServiceImpl implements ArService {

	@Inject
	private ArDAO arDAO;

	public ResponseVO fetchAllAccessrights() {
		ResponseVO ars=new ResponseVO();
		ars.setCollection(this.arDAO.fetchAllArs());
		return ars;
	}

}
