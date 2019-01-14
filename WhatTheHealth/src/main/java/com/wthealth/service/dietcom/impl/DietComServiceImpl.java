package com.wthealth.service.dietcom.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.Post;
import com.wthealth.service.dietcom.DietComDao;
import com.wthealth.service.dietcom.DietComService;

@Service("dietComServiceImpl")
public class DietComServiceImpl implements DietComService {

	@Autowired
	@Qualifier("dietComDaoImpl")
	private DietComDao dietComDao;
	public void setDietComDao(DietComDao dietComDao) {
		this.dietComDao = dietComDao;
	}
	
	public DietComServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addDietCom(Post post) throws Exception {
		// TODO Auto-generated method stub
	}
	

	@Override
	public Post getDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Map<String, Object> listDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDietCom(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> listDietComRecom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
