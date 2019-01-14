package com.wthealth.service.exinfo.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;
import com.wthealth.service.exinfo.ExInfoDao;
import com.wthealth.service.exinfo.ExInfoService;


@Service("exInfoServiceImpl")
public class ExInfoServiceImpl implements ExInfoService {

	//Field
	@Autowired
	@Qualifier("exInfoDaoImpl")
	private ExInfoDao exInfoDao;
	public void setExInfoDao(ExInfoDao exInfoDao) {
		this.exInfoDao = exInfoDao;
	}
	
	//Constructor
	public ExInfoServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addExInfo(Post post) throws Exception {
		exInfoDao.addExInfo(post);
	}

	@Override
	public Post getExInfo(int exInfoNo) throws Exception {
		return exInfoDao.getExInfo(exInfoNo);
	}

	@Override
	public void updateExinfo(Post post) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> listExInfo(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteExInfo(int postNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> listExInfo(String Weather) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
