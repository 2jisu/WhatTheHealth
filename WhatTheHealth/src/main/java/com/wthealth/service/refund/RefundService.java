package com.wthealth.service.refund;

import java.util.List;
import java.util.Map;

import com.wthealth.common.Search;
import com.wthealth.domain.Refund;

public interface RefundService {

	public void addRefund(Refund refund) throws Exception;

	public Map<String, Object> listRefund(Search search) throws Exception;

	public Refund getRefund(int refundNo) throws Exception;

	public void updateRefund(Refund refund) throws Exception;

	public Map<String, Object> listRefundAdmin(Search search) throws Exception;
}
