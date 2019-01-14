package com.wthealth.service.dietschedule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.BMI;
import com.wthealth.domain.DietSchedule;
import com.wthealth.service.dietschedule.DietScheduleDao;
import com.wthealth.service.dietschedule.DietScheduleService;

@Service("dietScheduleServiceImpl")
public class DietScheduleServiceImpl implements DietScheduleService {

	///Field
	@Autowired
	@Qualifier("dietScheduleDaoImpl")
	private DietScheduleDao dietScheduleDao;
	
	
	///Constructor
	public void setDietScheduleDao(DietScheduleDao dietScheduleDao) {
		this.dietScheduleDao = dietScheduleDao;
	}

	public DietScheduleServiceImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void addDietSchedule(DietSchedule dietSchedule) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDietSchedule(int dietScNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listDietSchedule(String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDietSchedule(DietSchedule dietSchedule, String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDietHistoryChart(String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDietSchedule(int dietScNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBmi(BMI bmi) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
