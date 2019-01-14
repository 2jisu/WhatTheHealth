package com.wthealth.domain;

public class Claim {
	
	private int claimNo;
	private String userId;
	private String claimedUserId;
	private String claimDate;
	private int claimSortNo;
	private String claimStatus;
	private String postNo;

	public Claim(){
	}

	public int getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(int claimNo) {
		this.claimNo = claimNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClaimedUserId() {
		return claimedUserId;
	}

	public void setClaimedUserId(String claimedUserId) {
		this.claimedUserId = claimedUserId;
	}

	public String getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public int getClaimSortNo() {
		return claimSortNo;
	}

	public void setClaimSortNo(int claimSortNo) {
		this.claimSortNo = claimSortNo;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	
}
