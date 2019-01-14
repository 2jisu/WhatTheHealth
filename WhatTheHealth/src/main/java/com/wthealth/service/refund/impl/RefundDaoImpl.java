package com.wthealth.service.refund.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Refund;
import com.wthealth.service.refund.RefundDao;

@Repository("refundDaoImpl")
public class RefundDaoImpl implements RefundDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public RefundDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addRefund(Refund refund) throws Exception {
		sqlSession.selectOne("RefundMapper.addRefund", refund);
	}

	@Override
	public List<Refund> listRefund(Search search) throws Exception {
		System.out.println("search : " + search);
		System.out.println("listRefund : " + sqlSession.selectList("RefundMapper.listRefund", search));

		return sqlSession.selectList("RefundMapper.listRefund", search);
	}
	
	@Override
	public Refund getRefund(int refundNo) throws Exception {
		return sqlSession.selectOne("RefundMapper.getRefund", refundNo);
	}
	
	
	@Override
	public void updateRefund(Refund refund) throws Exception {
		sqlSession.update("refundMapper.updateRefund", refund);
	}

	@Override
	public List<Refund> listRefundAdmin(Search search) throws Exception {
		System.out.println("search : " + search);
		System.out.println("listRefundAdmin : " + sqlSession.selectList("RefundMapper.listRefundAdmin", search));

		return sqlSession.selectList("RefundMapper.listRefundAdmin", search);
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("RefundMapper.getTotalCount", search);
	}


}
