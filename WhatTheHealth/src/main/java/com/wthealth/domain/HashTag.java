package com.wthealth.domain;

public class HashTag {
	
	private int hashTagNo;
	private int hashTag;
	private int postNo;
	
	
	public int getHashTagNo() {
		return hashTagNo;
	}
	public void setHashTagNo(int hashTagNo) {
		this.hashTagNo = hashTagNo;
	}
	public int getHashTag() {
		return hashTag;
	}
	public void setHashTag(int hashTag) {
		this.hashTag = hashTag;
	}
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	@Override
	public String toString() {
		return "HashTag [hashTagNo=" + hashTagNo + ", hashTag=" + hashTag + ", postNo=" + postNo + "]";
	}
	

}