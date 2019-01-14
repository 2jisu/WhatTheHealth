package com.wthealth.service.adminmanage.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.common.Search;
import com.wthealth.domain.Point;
import com.wthealth.domain.User;
import com.wthealth.service.adminmanage.AdminManageDao;
import com.wthealth.service.adminmanage.AdminManageService;


@Service("adminManageServiceImpl")
public class AdminManageServiceImpl implements AdminManageService {

	//Field
	@Autowired
	@Qualifier("adminManageDaoImpl")
	private AdminManageDao adminManageDao;
	public void setAdminManageDao(AdminManageDao adminManageDao) {
		this.adminManageDao = adminManageDao;
	}
	
	//Constructor
	public AdminManageServiceImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public List<User> listUserAdminManage(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAdminManage(String userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserAdminManage(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}


	

}
