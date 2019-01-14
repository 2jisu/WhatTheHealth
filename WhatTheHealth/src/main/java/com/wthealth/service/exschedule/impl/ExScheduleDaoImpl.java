package com.wthealth.service.exschedule.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.service.exschedule.ExScheduleDao;
@Repository("exScheduleDaoImpl")
public class ExScheduleDaoImpl implements ExScheduleDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ExScheduleDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void addExSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void getSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateExSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void listExSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void getExHistoryChart() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExSchedule() throws Exception {
		// TODO Auto-generated method stub

	}

}
