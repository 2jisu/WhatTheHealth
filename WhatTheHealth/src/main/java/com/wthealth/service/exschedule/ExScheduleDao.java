package com.wthealth.service.exschedule;

public interface ExScheduleDao {

	public void addExSchedule() throws Exception;
	
	public void getSchedule() throws Exception;
	
	public void updateExSchedule() throws Exception; 
	
	public void listExSchedule() throws Exception;
	
	public void getExHistoryChart() throws Exception;
	
	public void deleteExSchedule() throws Exception; 
}
