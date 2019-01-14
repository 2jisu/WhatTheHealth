package com.wthealth.service.claim.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.service.claim.ClaimDao;
import com.wthealth.service.claim.ClaimService;

@Service("claimServiceImpl")
public class ClaimServiceImpl implements ClaimService {

	///Field
	@Autowired
	@Qualifier("claimDaoImpl")
	private ClaimDao claimDao;
	
	public void setClaimDao(ClaimDao claimDao) {
		this.claimDao = claimDao;
	}
	///Constructor
	public ClaimServiceImpl() {
		System.out.println(this.getClass());
	}

	///Method
	@Override
	public void listClaim() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClaim() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClaim() throws Exception {
		// TODO Auto-generated method stub

	}

}
