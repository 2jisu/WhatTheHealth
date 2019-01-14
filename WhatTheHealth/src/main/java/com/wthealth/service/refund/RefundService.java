package com.wthealth.service.refund;

import java.util.List;
import java.util.Map;

import com.wthealth.domain.Refund;

public interface RefundService {

	public void addRefund(Refund refund) throws Exception;

	public Map<String, Object> listRefund(int refundNo) throws Exception;

	public Refund getRefund(int refundNo) throws Exception;

	public void updateRefund(Refund refund) throws Exception;

	public List<Refund> listRefundAdmin(int refundNo) throws Exception;
}
