package com.wthealth.domain;

public class BMI {

	//Field
	private String gendar;	
	private Double height; // endUser Å°
	private Double bmiWeight; //endUser ¸ö¹«°Ô
	private int age; // endUser ³ªÀÌ
	private Double bmiValue; //endUser 
	private String bmiState; //ºñ¸¸ Ã´µµ
	
	//Constructor
	public BMI(Double height, Double bmiWeight){
		this.bmiValue = bmiWeight/height*height;
	}

	public BMI(Double bmiValue) {
	}
	
	//Method
	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getBmiWeight() {
		return bmiWeight;
	}

	public void setBmiWeight(Double bmiWeight) {
		this.bmiWeight = bmiWeight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getBmiValue() {
		return bmiValue;
	}

	public void setBmiValue(Double bmiValue) {
		this.bmiValue = bmiValue;
	}

	public String getBmiState() {
		return bmiState;
	}

	public void setBmiState(String bmiState) {
		this.bmiState = bmiState;
	}

	@Override
	public String toString() {
		return "BMI [gendar=" + gendar + ", height=" + height + ", bmiWeight=" + bmiWeight + ", age=" + age
				+ ", bmiValue=" + bmiValue + ", bmiState=" + bmiState + "]";
	}
	
	
	

	
}
