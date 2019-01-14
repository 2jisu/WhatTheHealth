package com.wthealth.service.excom.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.Post;
import com.wthealth.service.excom.ExComDao;
import com.wthealth.service.excom.ExComService;

@Service("exComServiceImpl")
public class ExComServiceImpl implements ExComService {

	@Autowired
	@Qualifier("exComDaoImpl")
	private ExComDao exComDao;
	public void setDietComDao(ExComDao exComDao) {
		this.exComDao = exComDao;
	}
	
	public ExComServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addExCom(Post post) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Post getExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> listExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateExCom(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> listExComRecom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
