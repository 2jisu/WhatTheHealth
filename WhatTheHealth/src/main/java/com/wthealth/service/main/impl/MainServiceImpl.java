package com.wthealth.service.main.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.service.main.MainDao;
import com.wthealth.service.main.MainService;

@Service("mainServiceImpl")
public class MainServiceImpl implements MainService {
	
	//Field
	@Autowired
	@Qualifier("mainDaoImpl")
	private MainDao mainDao;
	public void setMainDao(MainDao mainDao) {
		this.mainDao = mainDao;
	}

	//Constructor
	public MainServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public Map<String, Object> listSearchMain(Search search) throws Exception {
		return null;
	}

}
