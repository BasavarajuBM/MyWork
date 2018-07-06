package com.basu.accessright.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.basu.accessright.dao.ArDAO;
import com.basu.accessright.vo.ArVO;

@Repository
public class ArDAOImpl implements ArDAO {

	public List<ArVO> fetchAllArs(){
		List<ArVO> arVOs=new ArrayList<>();
		ArVO arVO=new ArVO("AR1", "1");
		arVOs.add(arVO);
		return arVOs;
	}
}
