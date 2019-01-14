package com.wthealth.service.dietschedule;

import com.wthealth.domain.BMI;
import com.wthealth.domain.DietSchedule;

public interface DietScheduleService {

	public void addDietSchedule(DietSchedule dietSchedule) throws Exception;
	
	public void getDietSchedule(int dietScNo) throws Exception;
	
	public void listDietSchedule(String userId) throws Exception;
	
	public void updateDietSchedule(DietSchedule dietSchedule, String userId) throws Exception;
	
	public void getDietHistoryChart(String userId) throws Exception;
	
	public void deleteDietSchedule(int dietScNo) throws Exception;
	
	public void addBmi(BMI bmi) throws Exception; 
	
}
