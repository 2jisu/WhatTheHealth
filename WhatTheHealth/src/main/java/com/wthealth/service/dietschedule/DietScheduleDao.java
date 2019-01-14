package com.wthealth.service.dietschedule;

public interface DietScheduleDao {
	
	public void getDietSchedule() throws Exception;
	
	public void listDietSchedule() throws Exception;
	
	public void updateDietSchedule() throws Exception;
	
	public void addDietSchedule() throws Exception;
	
	public void deleteDietSchedule() throws Exception;
	
	public void addBmi() throws Exception; 

}
