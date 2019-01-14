package com.wthealth.service.dietcom.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.wthealth.common.Search;
import com.wthealth.domain.Post;
import com.wthealth.service.dietcom.DietComDao;

@Repository("dietComDaoImpl")
public class DietComDaoImpl implements DietComDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public DietComDaoImpl() {
		System.out.println(this.getClass());
	}
	
	@Override
	public void addDietCom(Post post) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Post> listDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDietCom(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> listDietComRecom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCount(Search search) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Post getDietCom(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
