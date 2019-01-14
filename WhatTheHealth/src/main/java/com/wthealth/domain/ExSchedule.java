package com.wthealth.domain;

import java.sql.Date;

public class ExSchedule {
	
	private int exScNo;
	private String userId;
	private String exScName;
	private int exScCalorie;
	private Date exScTime;
	private String exScContents;
	private Date exScDate;
	private int exCalorie;
	
	public ExSchedule() {
	}

	public int getExScNo() {
		return exScNo;
	}

	public void setExScNo(int exScNo) {
		this.exScNo = exScNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExScName() {
		return exScName;
	}

	public void setExScName(String exScName) {
		this.exScName = exScName;
	}

	public int getExScCalorie() {
		return exScCalorie;
	}

	public void setExScCalorie(int exScCalorie) {
		this.exScCalorie = exScCalorie;
	}

	public Date getExScTime() {
		return exScTime;
	}

	public void setExScTime(Date exScTime) {
		this.exScTime = exScTime;
	}

	public String getExScContents() {
		return exScContents;
	}

	public void setExScContents(String exScContents) {
		this.exScContents = exScContents;
	}

	public Date getExScDate() {
		return exScDate;
	}

	public void setExScDate(Date exScDate) {
		this.exScDate = exScDate;
	}

	public int getExCalorie() {
		return exCalorie;
	}

	public void setExCalorie(int exCalorie) {
		this.exCalorie = exCalorie;
	}
	
	

}
