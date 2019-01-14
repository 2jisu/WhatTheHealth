package com.wthealth.service.dietschedule.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.service.dietschedule.DietScheduleDao;
@Repository("dietScheduleDaoImpl")
public class DietScheduleDaoImpl implements DietScheduleDao {

	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public DietScheduleDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void getDietSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void listDietSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDietSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDietSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDietSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBmi() throws Exception {
		// TODO Auto-generated method stub

	}

}
