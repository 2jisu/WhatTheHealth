package com.wthealth.service.refund.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wthealth.domain.Refund;
import com.wthealth.service.refund.RefundDao;
import com.wthealth.service.refund.RefundService;

@Service("refundServiceImpl")
public class RefundServiceImpl implements RefundService {

	@Autowired
	@Qualifier("refundDaoImpl")
	private RefundDao refundDao;
	public void setRefundDao(RefundDao refundDao) {
		this.refundDao = refundDao;
	}
	
	public RefundServiceImpl() {
		System.out.println(this.getClass());
	}


	@Override
	public void addRefund(Refund refund) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Map<String, Object> listRefund(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void updateRefund(Refund refund) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Refund> listRefundAdmin(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Refund getRefund(int refundNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
