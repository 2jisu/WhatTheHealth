package com.wthealth.service.excom.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;
import com.wthealth.service.excom.ExComDao;

@Repository("exComDaoImpl")
public class ExComDaoImpl implements ExComDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public ExComDaoImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addExCom(Post post) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Post getExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> listExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateExCom(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExCom(int postNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> listExComRecom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
