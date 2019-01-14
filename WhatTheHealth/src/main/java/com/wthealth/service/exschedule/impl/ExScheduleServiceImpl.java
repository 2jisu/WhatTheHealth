package com.wthealth.service.exschedule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.service.exschedule.ExScheduleDao;
import com.wthealth.service.exschedule.ExScheduleService;

@Service("exScheduleServiceImpl")
public class ExScheduleServiceImpl implements ExScheduleService {

	///Field
	@Autowired
	@Qualifier("exScheduleDaoImpl")
	private ExScheduleDao exScheduleDao;
	
	
	///Constructor
	public void setExScheduleDao(ExScheduleDao exScheduleDao) {
		this.exScheduleDao = exScheduleDao;
	}

	public ExScheduleServiceImpl() {
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
